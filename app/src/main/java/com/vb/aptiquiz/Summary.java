package com.vb.aptiquiz;

import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.beardedhen.androidbootstrap.BootstrapButton;

import java.util.Timer;
import java.util.TimerTask;


public class Summary extends AppCompatActivity implements View.OnClickListener {
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

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        SummaryFragment summary = new SummaryFragment();
        summary.setArguments(b1);
        fragmentTransaction.add(R.id.summary_fragment, summary, "Summary");
        fragmentTransaction.commit();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        this.b1 = (BootstrapButton) findViewById(R.id.button31);
        this.b1.setOnClickListener(this);


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

        if (ch == 'a') {
            s = b1.getString(KEY_PARA);
        }

        for (int i = 0; i < 30; i++) {
            if (a[i] == 1) {
                at++;
            } else if (a[i] == -1) {
                nt++;
            } else {
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

    public void buttonClicked(int button) {
        Intent in;
        Bundle b = new Bundle();

        if (ch == 'a') {
            in = new Intent(this, Aptitude.class);
            b.putString(KEY_PARA, s);
        } else
            in = new Intent(this, Verbal_Ability.class);

        b.putChar(KEY_LOAD, 'y');
        b.putInt(KEY_NO, button + 1);
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
            ad.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

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

            ad.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            });
            ad.show();

        }
    }

    }
