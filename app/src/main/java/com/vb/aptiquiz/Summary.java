package com.vb.aptiquiz;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.beardedhen.androidbootstrap.BootstrapButton;

import java.util.Timer;
import java.util.TimerTask;


public class Summary extends AppCompatActivity implements View.OnClickListener {
    Button b[] = new Button[30];
    BootstrapButton b1;
    TextView tv1, tv2, tv3, tv4, tv5;

    String s;
    int nt = 0, at = 0, i, u[] = new int[30], a[] = new int[30], c[] = new int[30], min, sec, v = 0;
    char ch;
    static int interval;
    static Timer timer;
    final static String KEY_LOAD = "load";
    final static String KEY_INTERVAL = "interval";
    final static String KEY_I = "i";
    final static String KEY_NO = "no.";
    final static String KEY_U = "u";
    final static String KEY_ATTEMPTED = "attempted";
    final static String KEY_CORRECT = "correct";
    final static String KEY_PARA = "paragraph";
    final static String KEY_TEST = "test";
    final static String KEY_MIN = "min";
    final static String KEY_SEC = "sec";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        b1 = (BootstrapButton) findViewById(R.id.button31);
        b1.setOnClickListener(this);


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


        tv1 = (TextView) findViewById(R.id.textView4);
        tv2 = (TextView) findViewById(R.id.textView5);
        tv3 = (TextView) findViewById(R.id.textView6);
        tv4 = (TextView) findViewById(R.id.textView2);
        tv5 = (TextView) findViewById(R.id.textView7);

        timing();

        tv1.setTextColor(Color.BLACK);
        tv2.setTextColor(Color.BLACK);
        tv3.setTextColor(Color.BLACK);
        tv1.setBackgroundColor(Color.GREEN);
        tv2.setBackgroundColor(Color.CYAN);
        tv3.setBackgroundColor(getResources().getColor(R.color.alternate));

        Intent in = getIntent();
        Bundle b1 = in.getExtras();

        u = b1.getIntArray(KEY_U);
        a = b1.getIntArray(KEY_ATTEMPTED);
        c = b1.getIntArray(KEY_CORRECT);
        i = b1.getInt(KEY_I);
        interval = b1.getInt(KEY_INTERVAL);
        min = b1.getInt(KEY_MIN);
        sec = b1.getInt(KEY_SEC);
        ch = b1.getChar(KEY_TEST);

        if (ch == 'a') {
            s = b1.getString(KEY_PARA);
        }

        for (int i = 0; i < 30; i++) {
            if (a[i] == 1) {
                b[i].setBackgroundColor(Color.GREEN);
                at++;
            } else if (a[i] == -1) {
                b[i].setBackgroundColor(Color.CYAN);
                nt++;
            } else {
                b[i].setBackgroundColor(getResources().getColor(R.color.alternate));
                v++;
            }
        }

        tv4.setMovementMethod(new ScrollingMovementMethod());
        tv4.setText(String.format(getString(R.string.summary_placeholder), at, nt, v));
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return false;
    }

    public void onBackPressed() {
        Intent in;
        Bundle b = new Bundle();

        if (ch == 'a') {
            in = new Intent(this, Aptitude.class);
            b.putString(KEY_PARA, s);
        } else
            in = new Intent(this, Verbal_Ability.class);

        b.putChar(KEY_LOAD, 'n');
        b.putIntArray(KEY_U, u);
        b.putInt(KEY_I, i + 1);
        b.putInt(KEY_INTERVAL, interval);
        b.putIntArray(KEY_ATTEMPTED, a);
        b.putIntArray(KEY_CORRECT, c);
        b.putInt(KEY_MIN, min);
        b.putInt(KEY_SEC, sec);
        b.putChar(KEY_TEST, ch);
        in.putExtras(b);
        startActivity(in);
    }

    public void timing() {

        int delay = 0;
        int period = 1000;
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {

                runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        setInterval();
                    }
                });
            }

        }, delay, period);
    }

    public int setInterval() {

        if (sec < 10) {
            tv5.setText(String.format(getString(R.string.time_place_sec), min, sec));
        } else {
            tv5.setText(String.format(getString(R.string.time_placeholder), min, sec));
        }

        if (sec == 0) {
            min--;
            sec = 60;
        }

        sec--;

        if (interval == 0) {
            timer.cancel();
            ProgressDialog pd = ProgressDialog.show(Summary.this, getString(R.string.submit_test), getString(R.string.wait));
            new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            Intent in = new Intent(Summary.this, Result.class);
            Bundle b = new Bundle();

            b.putIntArray(KEY_U, u);
            b.putIntArray(KEY_ATTEMPTED, a);
            b.putIntArray(KEY_CORRECT, c);
            b.putChar(KEY_TEST, ch);
            if (ch == 'a')
                b.putString(KEY_PARA, s);

            in.putExtras(b);
            startActivity(in);

        }
        return --interval;
    }

    @Override
    public void onClick(View v) {

        if (v == b1) {
            AlertDialog.Builder ad = new AlertDialog.Builder(this);
            ad.setIcon(R.drawable.ic_warning_black_24dp);
            ad.setTitle(getString(R.string.confirm_ad));
            ad.setMessage(getString(R.string.sub));
            ad.setIcon(android.R.drawable.stat_notify_error);
            ad.setNegativeButton("Ok", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {
                    timer.cancel();
                    Intent in = new Intent(Summary.this, Result.class);
                    Bundle b = new Bundle();

                    b.putIntArray(KEY_U, u);
                    b.putIntArray(KEY_ATTEMPTED, a);
                    b.putIntArray(KEY_CORRECT, c);

                    if (ch == 'a')
                        b.putString(KEY_PARA, s);

                    b.putChar(KEY_TEST, ch);
                    in.putExtras(b);
                    startActivity(in);
                }
            });

            ad.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            });
            ad.show();

        } else {
            for (int i = 0; i < 30; i++) {
                if (v == b[i]) {
                    Intent in;
                    Bundle b = new Bundle();

                    if (ch == 'a') {
                        in = new Intent(this, Aptitude.class);
                        b.putString(KEY_PARA, s);
                    } else
                        in = new Intent(this, Verbal_Ability.class);

                    b.putChar(KEY_LOAD, 'y');
                    b.putInt(KEY_NO, i + 1);
                    b.putInt(KEY_INTERVAL, interval);
                    b.putIntArray(KEY_U, u);
                    b.putIntArray(KEY_ATTEMPTED, a);
                    b.putIntArray(KEY_CORRECT, c);
                    b.putInt(KEY_MIN, min);
                    b.putInt(KEY_SEC, sec);
                    b.putChar(KEY_TEST, ch);
                    in.putExtras(b);
                    startActivity(in);
                }
            }
        }
    }
}
