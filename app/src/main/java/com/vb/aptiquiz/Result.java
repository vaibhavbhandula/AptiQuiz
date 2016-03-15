package com.vb.aptiquiz;

import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    TextView tv, tv1, tv2, tv3, score;

    int res = 0, left = 0, u[] = new int[30], a[] = new int[30], c[] = new int[30];
    String s;
    char ch;
    String result = "";
    float sc;

    SQLiteDatabase db;

    final static String KEY_TABLE_NAME_VB = "verbaltest";
    final static String KEY_NO = "no.";
    final static String KEY_U = "u";
    final static String KEY_ATTEMPTED = "attempted";
    final static String KEY_CORRECT = "correct";
    final static String KEY_PARA = "paragraph";
    final static String KEY_TEST = "test";
    final static String KEY_TABLE_NAME_APTITUDE = "aptitest";
    final static String KEY_DB = "project";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        Intent in = getIntent();
        Bundle b1 = in.getExtras();

        c = b1.getIntArray(KEY_CORRECT);
        a = b1.getIntArray(KEY_ATTEMPTED);
        u = b1.getIntArray(KEY_U);
        ch = b1.getChar(KEY_TEST);

        if (ch == 'a')
            s = b1.getString(KEY_PARA);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ResultFragment resultFragment = new ResultFragment();
        resultFragment.setArguments(b1);
        fragmentTransaction.add(R.id.result_fragment, resultFragment, "Result");
        fragmentTransaction.commit();

        tv = (TextView) findViewById(R.id.textView2);
        tv1 = (TextView) findViewById(R.id.textView3);
        tv2 = (TextView) findViewById(R.id.textView4);
        tv3 = (TextView) findViewById(R.id.textView5);
        score = (TextView) findViewById(R.id.score);

        tv1.setTextColor(Color.BLACK);
        tv2.setTextColor(Color.BLACK);
        tv3.setTextColor(Color.BLACK);
        tv1.setBackgroundColor(Color.GREEN);
        tv2.setBackgroundColor(Color.RED);
        tv3.setBackgroundColor(getResources().getColor(R.color.alternate));

        for (int i = 0; i < 30; i++) {
            if (c[i] == 1) {
                res++;
            } else if (c[i] == -1) {
                left++;
            }
        }

        sc = (float) (res / (0.3));

        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(String.format(getString(R.string.result_placeholder), res, left, (30 - left - res)));

        if (ch == 'a') {
            if (sc >= 75) {
                result = "Passed";
                score.setText(String.format(getString(R.string.score), sc, result));
            } else {
                result = "Failed";
                score.setText(String.format(getString(R.string.score), sc, result));
            }
        } else {
            if (sc >= 60) {
                result = "Passed";
                score.setText(String.format(getString(R.string.score), sc, result));
            } else {
                result = "Failed";
                score.setText(String.format(getString(R.string.score), sc, result));
            }
        }
    }


    public void buttonClicked(int button) {
        Intent in = new Intent(this, Check_Question.class);
        Bundle b = new Bundle();

        b.putInt(KEY_NO, button + 1);
        b.putIntArray(KEY_U, u);
        b.putChar(KEY_TEST, ch);
        if (ch == 'a')
            b.putString(KEY_PARA, s);
        in.putExtras(b);
        startActivity(in);
    }

    public void onBackPressed() {
        AlertDialog.Builder ad = new AlertDialog.Builder(this);
        ad.setIcon(R.drawable.ic_warning_black_24dp);
        ad.setTitle(getString(R.string.confirm_ad));
        ad.setMessage(getString(R.string.alert_quit));
        ad.setIcon(android.R.drawable.stat_notify_error);
        ad.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                db = openOrCreateDatabase(KEY_DB, 0, null);
                if (ch == 'a')
                    db.execSQL("drop table if exists " + KEY_TABLE_NAME_APTITUDE);
                else
                    db.execSQL("drop table if exists " + KEY_TABLE_NAME_VB);
                db.close();
                finishAffinity();
            }
        });

        ad.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        ad.show();
    }

}
