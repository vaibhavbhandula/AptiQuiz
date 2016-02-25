package com.vb.aptiquiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity implements OnClickListener {
    Button b[] = new Button[30];
    TextView tv, tv1, tv2, tv3, score;

    int res = 0, left = 0, u[] = new int[30], a[] = new int[30], c[] = new int[30];
    String s;
    char ch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tv = (TextView) findViewById(R.id.textView2);
        tv1 = (TextView) findViewById(R.id.textView3);
        tv2 = (TextView) findViewById(R.id.textView4);
        tv3 = (TextView) findViewById(R.id.textView5);
        score = (TextView) findViewById(R.id.score);
        b[0] = (Button) findViewById(R.id.button1);
        b[0].setOnClickListener(this);

        b[1] = (Button) findViewById(R.id.button2);
        b[1].setOnClickListener(this);

        b[2] = (Button) findViewById(R.id.button3);
        b[2].setOnClickListener(this);

        b[3] = (Button) findViewById(R.id.button4);
        b[3].setOnClickListener(this);

        b[4] = (Button) findViewById(R.id.button5);
        b[4].setOnClickListener(this);

        b[5] = (Button) findViewById(R.id.button6);
        b[5].setOnClickListener(this);

        b[6] = (Button) findViewById(R.id.button7);
        b[6].setOnClickListener(this);

        b[7] = (Button) findViewById(R.id.button8);
        b[7].setOnClickListener(this);

        b[8] = (Button) findViewById(R.id.button9);
        b[8].setOnClickListener(this);

        b[9] = (Button) findViewById(R.id.button10);
        b[9].setOnClickListener(this);

        b[10] = (Button) findViewById(R.id.button11);
        b[10].setOnClickListener(this);

        b[11] = (Button) findViewById(R.id.button12);
        b[11].setOnClickListener(this);

        b[12] = (Button) findViewById(R.id.button13);
        b[12].setOnClickListener(this);

        b[13] = (Button) findViewById(R.id.button14);
        b[13].setOnClickListener(this);

        b[14] = (Button) findViewById(R.id.button15);
        b[14].setOnClickListener(this);

        b[15] = (Button) findViewById(R.id.button16);
        b[15].setOnClickListener(this);

        b[16] = (Button) findViewById(R.id.button17);
        b[16].setOnClickListener(this);

        b[17] = (Button) findViewById(R.id.button18);
        b[17].setOnClickListener(this);

        b[18] = (Button) findViewById(R.id.button19);
        b[18].setOnClickListener(this);

        b[19] = (Button) findViewById(R.id.button20);
        b[19].setOnClickListener(this);

        b[20] = (Button) findViewById(R.id.button21);
        b[20].setOnClickListener(this);

        b[21] = (Button) findViewById(R.id.button22);
        b[21].setOnClickListener(this);

        b[22] = (Button) findViewById(R.id.button23);
        b[22].setOnClickListener(this);

        b[23] = (Button) findViewById(R.id.button24);
        b[23].setOnClickListener(this);

        b[24] = (Button) findViewById(R.id.button25);
        b[24].setOnClickListener(this);

        b[25] = (Button) findViewById(R.id.button26);
        b[25].setOnClickListener(this);

        b[26] = (Button) findViewById(R.id.button27);
        b[26].setOnClickListener(this);

        b[27] = (Button) findViewById(R.id.button28);
        b[27].setOnClickListener(this);

        b[28] = (Button) findViewById(R.id.button29);
        b[28].setOnClickListener(this);

        b[29] = (Button) findViewById(R.id.button30);
        b[29].setOnClickListener(this);

        Intent in = getIntent();
        Bundle b1 = in.getExtras();

        c = b1.getIntArray("correct");
        a = b1.getIntArray("attempted");
        u = b1.getIntArray("u");
        ch = b1.getChar("test");

        if (ch == 'a')
            s = b1.getString("paragraph");

        tv1.setTextColor(Color.BLACK);
        tv2.setTextColor(Color.BLACK);
        tv3.setTextColor(Color.BLACK);
        tv1.setBackgroundColor(Color.GREEN);
        tv2.setBackgroundColor(Color.RED);
        tv3.setBackgroundColor(getResources().getColor(R.color.alternate));

        for (int i = 0; i < 30; i++) {
            if (c[i] == 1) {
                b[i].setBackgroundColor(Color.GREEN);
                res++;
            } else if (c[i] == -1) {
                b[i].setBackgroundColor(Color.RED);
                left++;
            } else {
                b[i].setBackgroundColor(getResources().getColor(R.color.alternate));
            }
        }

        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText("Correct         :  " + res + "\nInCorrect       :  " + (left) + "\nNot Attempted   :  " + (30 - left - res));
        if (ch == 'a') {
            if (res / (0.3) >= 75) {
                score.setText("Score  : " + (res / (0.3)) + "%\n" + "Passed");
            } else {
                score.setText("Score  : " + (res / (0.3)) + "%\n" + "Failed");
            }
        } else {
            if (res / (0.3) >= 60) {
                score.setText("Score  : " + (res / (0.3)) + "%\n" + "Passed");
            } else {
                score.setText("Score  : " + (res / (0.3)) + "%\n" + "Failed");
            }
        }
    }

    public void onBackPressed() {
        // TODO Auto-generated method stub
        AlertDialog.Builder ad = new AlertDialog.Builder(this);
        ad.setIcon(R.drawable.ic_warning_black_24dp);
        ad.setTitle("Confirm");
        ad.setMessage("Are you sure you want to quit this app?");
        ad.setIcon(android.R.drawable.stat_notify_error);
        ad.setNegativeButton("Ok", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
                SQLiteDatabase db = openOrCreateDatabase("project", 0, null);
                if (ch == 'a')
                    db.execSQL("drop table if exists aptitest");
                else
                    db.execSQL("drop table if exists verbaltest");
                db.close();
                finishAffinity();
            }
        });

        ad.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
            }
        });
        ad.show();
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

        for (int i = 0; i < 30; i++) {
            if (v == b[i]) {
                Intent in = new Intent(this, Check_Question.class);
                Bundle b = new Bundle();

                b.putInt("no.", i + 1);
                b.putIntArray("u", u);
                b.putChar("test", ch);
                if (ch == 'a')
                    b.putString("paragraph", s);
                in.putExtras(b);
                startActivity(in);
            }
        }
    }
}
