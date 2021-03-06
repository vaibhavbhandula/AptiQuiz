package com.vb.aptiquiz;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import com.beardedhen.androidbootstrap.BootstrapButton;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class Aptitude extends AppCompatActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {
    TextView tv1, tv2, tv3, time;
    BootstrapButton b1, b2, b3;
    RadioGroup rg;
    RadioButton rb1, rb2, rb3, rb4, rb5;
    ScrollView scrollView;

    SQLiteDatabase db;

    int i = 0, flag = 0, p, flag1 = 0, y;
    char ch;
    String s;

    static Timer timer;
    int sec = 0;
    int min = 40;
    static int interval;
    final static int ques = 30;
    int z[] = new int[30], u[] = new int[30], a[] = new int[30], c[] = new int[30];

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
    final static String KEY_ID = "Id";
    final static String KEY_QUESTION = "Question";
    final static String KEY_OPA = "optiona";
    final static String KEY_OPB = "optionb";
    final static String KEY_OPC = "optionc";
    final static String KEY_OPD = "optiond";
    final static String KEY_OPE = "optione";
    final static String KEY_TABLE_NAME = "aptitest";
    final static String KEY_DB = "project";
    final static String KEY_MISC = "misc";
    final static String KEY_RELATION = "relation";
    final static String KEY_LOGIC = "logic";
    final static String KEY_SUFFICIENCY = "sufficiency";
    final static String KEY_SERIES = "series";
    final static String KEY_PUZZLE = "puzzle";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude);
        tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);
        time = (TextView) findViewById(R.id.time);

        rg = (RadioGroup) findViewById(R.id.radioGroup1);
        rb1 = (RadioButton) findViewById(R.id.radio0);
        rb2 = (RadioButton) findViewById(R.id.radio1);
        rb3 = (RadioButton) findViewById(R.id.radio2);
        rb4 = (RadioButton) findViewById(R.id.radio3);
        rb5 = (RadioButton) findViewById(R.id.radio4);
        scrollView = (ScrollView) findViewById(R.id.bottomHalf);
        rg.setOnCheckedChangeListener(this);

        b1 = (BootstrapButton) findViewById(R.id.button1);
        b1.setOnClickListener(this);

        b2 = (BootstrapButton) findViewById(R.id.button2);
        b2.setOnClickListener(this);

        b3 = (BootstrapButton) findViewById(R.id.button3);
        b3.setOnClickListener(this);


        timing();

        if (getIntent().getExtras() != null) {

            Intent in = getIntent();
            Bundle b = in.getExtras();

            if (b.getChar(KEY_LOAD) == 'n') {
                interval = b.getInt(KEY_INTERVAL);
                loadQuestion(b.getInt(KEY_I), b);
                flag1 = 1;
                flag = 1;
            } else if (b.getChar(KEY_LOAD) == 'y') {
                interval = b.getInt(KEY_INTERVAL);
                loadQuestion(b.getInt(KEY_NO), b);
                flag1 = 1;
                flag = 1;
            }
        } else {

            interval = 2400;
        }
        if (flag == 0) {
            loadTest(5);
        }

        if (flag1 == 0) {
            loadFirst();


        }
    }

    public void onBackPressed() {
        AlertDialog.Builder ad = new AlertDialog.Builder(this);
        ad.setIcon(R.drawable.ic_warning_black_24dp);
        ad.setTitle(getString(R.string.confirm_ad));
        ad.setMessage(getString(R.string.alert_quit));
        ad.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                timer.cancel();
                db = openOrCreateDatabase(KEY_DB, 0, null);
                db.execSQL("drop table if exists " + KEY_TABLE_NAME);
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

    public void loadFirst() {
        db = openOrCreateDatabase(KEY_DB, SQLiteDatabase.CREATE_IF_NECESSARY, null);
        Cursor c = db.query(KEY_TABLE_NAME, null, null, null, null, null, null);

        if (c.moveToFirst()) {
            y = Integer.parseInt(c.getString(0));

            tv2.setMovementMethod(new ScrollingMovementMethod());
            tv2.setText(c.getString(1));
            rb1.setText(c.getString(2));
            rb2.setText(c.getString(3));
            rb3.setText(c.getString(4));
            rb4.setText(c.getString(5));
            rb5.setText(c.getString(6));
            z[i] = Integer.parseInt(c.getString(7));

            if (flag == 1) {
                Intent in = getIntent();
                Bundle b = in.getExtras();

                u = b.getIntArray(KEY_U);
                i = b.getInt(KEY_I);

                if (u[i] == 1)
                    rb1.setChecked(true);

                else if (u[i] == 2)
                    rb2.setChecked(true);

                else if (u[i] == 3)
                    rb3.setChecked(true);

                else if (u[i] == 4)
                    rb4.setChecked(true);

                else if (u[i] == 5)
                    rb5.setChecked(true);
            }
        }
        if (c != null && !c.isClosed())
            c.close();

        db.close();
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
            tv3.setText(String.format(getString(R.string.question_placeholder), y, ques));
            time.setText(String.format(getString(R.string.time_place_sec), min, sec));
        } else {
            tv3.setText(String.format(getString(R.string.question_placeholder), y, ques));
            time.setText(String.format(getString(R.string.time_placeholder), min, sec));
        }

        if (sec == 0) {
            min--;
            sec = 60;
        }

        sec--;

        if (interval == 0) {
            timer.cancel();
            ProgressDialog pd = ProgressDialog.show(Aptitude.this, getString(R.string.submit_test), getString(R.string.wait));
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

            Intent in = new Intent(Aptitude.this, Result.class);
            Bundle b = new Bundle();

            b.putIntArray(KEY_U, u);
            b.putIntArray(KEY_ATTEMPTED, a);
            b.putIntArray(KEY_CORRECT, c);
            b.putString(KEY_PARA, s);
            b.putChar(KEY_TEST, 'a');
            in.putExtras(b);
            startActivity(in);


        }
        return --interval;
    }

    public int[] random(int n, int m) {
        int j, l, k, a[] = new int[n];

        for (l = 0; l < n; l++)
            a[l] = 0;

        Random r = new Random();
        l = 0;
        do {
            j = r.nextInt(m);
            k = search(a, j, n);
            if (k == -1) {
                a[l] = j;
                l++;
            }
        } while (l < n);

        return (a);
    }

    public int search(int a[], int j, int n) {
        int k = 0;
        for (int l = 0; l < n; l++) {
            if (a[l] == j)
                return (1);

            else
                k++;
        }

        if (k == n)
            return (-1);

        return 0;

    }

    public void loadQuestion(int n, Bundle b) {

        db = openOrCreateDatabase(KEY_DB, SQLiteDatabase.CREATE_IF_NECESSARY, null);
        Cursor c = db.query(KEY_TABLE_NAME, null, null, null, null, null, null);

        if (b.getIntArray(KEY_U) != null) {
            s = b.getString(KEY_PARA);
            u = b.getIntArray(KEY_U);
            a = b.getIntArray(KEY_ATTEMPTED);
            this.c = b.getIntArray(KEY_CORRECT);
            ch = b.getChar(KEY_TEST);
            min = b.getInt(KEY_MIN);
            sec = b.getInt(KEY_SEC);
        }

        if (c.moveToPosition(n - 1)) {
            y = Integer.parseInt(c.getString(0));
            String s1 = c.getString(1);
            String s2 = c.getString(2);
            String s3 = c.getString(3);
            String s4 = c.getString(4);
            String s5 = c.getString(5);
            String s6 = c.getString(6);

            if (n == 30) {
                b2.setText(R.string.submit);
            } else {
                b2.setText(R.string.next);
            }

            if (n == 26 || n == 27 || n == 28 || n == 29 || n == 30) {
                tv2.setMovementMethod(new ScrollingMovementMethod());
                tv2.setText(String.format(getString(R.string.para_placeholder), s, s1));
            } else {
                tv2.setMovementMethod(new ScrollingMovementMethod());
                tv2.setText(s1);
            }

            rb1.setText(s2);
            rb2.setText(s3);
            rb3.setText(s4);
            rb4.setText(s5);
            rb5.setText(s6);

            if (a[n - 1] == 1) {
                if (u[n - 1] == 1)
                    rb1.setChecked(true);

                else if (u[n - 1] == 2)
                    rb2.setChecked(true);

                else if (u[n - 1] == 3)
                    rb3.setChecked(true);

                else if (u[n - 1] == 4)
                    rb4.setChecked(true);

                else if (u[n - 1] == 5)
                    rb5.setChecked(true);
            } else {
                rb1.setChecked(false);
                rb2.setChecked(false);
                rb3.setChecked(false);
                rb4.setChecked(false);
                rb5.setChecked(false);
            }
            i = n - 1;
        }

        if (c != null && !c.isClosed())
            c.close();

        db.close();
    }

    public void loadTest(int m) {
        int a[] = new int[m];
        db = openOrCreateDatabase(KEY_DB, SQLiteDatabase.CREATE_IF_NECESSARY, null);

        db.execSQL("create table if not exists " + KEY_TABLE_NAME + "("
                + KEY_ID + " integer primary key,"
                + KEY_QUESTION + " text,"
                + KEY_OPA + " text,"
                + KEY_OPB + " text,"
                + KEY_OPC + " text,"
                + KEY_OPD + " text,"
                + KEY_OPE + " text,"
                + KEY_CORRECT + " text)");
        Cursor cr = db.query(KEY_TABLE_NAME, null, null, null, null, null, null);

        if (cr.getCount() != 30) {

            Cursor c1 = db.query(KEY_MISC, null, null, null, null, null, null);
            Cursor c2 = db.query(KEY_RELATION, null, null, null, null, null, null);
            Cursor c3 = db.query(KEY_LOGIC, null, null, null, null, null, null);
            Cursor c4 = db.query(KEY_SUFFICIENCY, null, null, null, null, null, null);
            Cursor c5 = db.query(KEY_SERIES, null, null, null, null, null, null);
            Cursor c6 = db.query(KEY_PUZZLE, null, null, null, null, null, null);
            Cursor c7 = db.query(KEY_PARA, null, null, null, null, null, null);

            int c = 0, n = 1;
            a = random(5, 50);

            do {
                if (c1.moveToPosition(a[c])) {
                    c++;
                    String s1 = c1.getString(1);
                    String s2 = c1.getString(2);
                    String s3 = c1.getString(3);
                    String s4 = c1.getString(4);
                    String s5 = c1.getString(5);
                    String s6 = c1.getString(6);
                    int z = Integer.parseInt(c1.getString(7));

                    ContentValues cv = new ContentValues();

                    cv.put(KEY_ID, n);
                    cv.put(KEY_QUESTION, s1);
                    cv.put(KEY_OPA, s2);
                    cv.put(KEY_OPB, s3);
                    cv.put(KEY_OPC, s4);
                    cv.put(KEY_OPD, s5);
                    cv.put(KEY_OPE, s6);
                    cv.put(KEY_CORRECT, z);
                    n++;

                    db.insert(KEY_TABLE_NAME, null, cv);
                }
            } while (c < 5);

            if (c1 != null && !c1.isClosed())
                c1.close();

            c = 0;
            a = random(5, 50);

            do {
                if (c2.moveToPosition(a[c])) {
                    c++;
                    String s1 = c2.getString(1);
                    String s2 = c2.getString(2);
                    String s3 = c2.getString(3);
                    String s4 = c2.getString(4);
                    String s5 = c2.getString(5);
                    String s6 = c2.getString(6);
                    int z = Integer.parseInt(c2.getString(7));

                    ContentValues cv = new ContentValues();

                    cv.put(KEY_ID, n);
                    cv.put(KEY_QUESTION, s1);
                    cv.put(KEY_OPA, s2);
                    cv.put(KEY_OPB, s3);
                    cv.put(KEY_OPC, s4);
                    cv.put(KEY_OPD, s5);
                    cv.put(KEY_OPE, s6);
                    cv.put(KEY_CORRECT, z);
                    n++;

                    db.insert(KEY_TABLE_NAME, null, cv);
                }
            } while (c < 5);

            if (c2 != null && !c2.isClosed())
                c2.close();

            c = 0;
            a = random(5, 50);

            do {
                if (c3.moveToPosition(a[c])) {
                    c++;
                    String s1 = c3.getString(1);
                    String s2 = c3.getString(2);
                    String s3 = c3.getString(3);
                    String s4 = c3.getString(4);
                    String s5 = c3.getString(5);
                    String s6 = c3.getString(6);
                    int z = Integer.parseInt(c3.getString(7));

                    ContentValues cv = new ContentValues();

                    cv.put(KEY_ID, n);
                    cv.put(KEY_QUESTION, s1);
                    cv.put(KEY_OPA, s2);
                    cv.put(KEY_OPB, s3);
                    cv.put(KEY_OPC, s4);
                    cv.put(KEY_OPD, s5);
                    cv.put(KEY_OPE, s6);
                    cv.put(KEY_CORRECT, z);
                    n++;

                    db.insert(KEY_TABLE_NAME, null, cv);
                }
            } while (c < 5);

            if (c3 != null && !c3.isClosed())
                c3.close();

            c = 0;
            a = random(5, 50);

            do {
                if (c4.moveToPosition(a[c])) {
                    c++;
                    String s1 = c4.getString(1);
                    String s2 = c4.getString(2);
                    String s3 = c4.getString(3);
                    String s4 = c4.getString(4);
                    String s5 = c4.getString(5);
                    String s6 = c4.getString(6);
                    int z = Integer.parseInt(c4.getString(7));

                    ContentValues cv = new ContentValues();

                    cv.put(KEY_ID, n);
                    cv.put(KEY_QUESTION, s1);
                    cv.put(KEY_OPA, s2);
                    cv.put(KEY_OPB, s3);
                    cv.put(KEY_OPC, s4);
                    cv.put(KEY_OPD, s5);
                    cv.put(KEY_OPE, s6);
                    cv.put(KEY_CORRECT, z);
                    n++;

                    db.insert(KEY_TABLE_NAME, null, cv);
                }
            } while (c < 5);

            if (c4 != null && !c4.isClosed())
                c4.close();

            c = 0;
            a = random(5, 50);

            do {
                if (c5.moveToPosition(a[c])) {
                    c++;
                    String s1 = c5.getString(1);
                    String s2 = c5.getString(2);
                    String s3 = c5.getString(3);
                    String s4 = c5.getString(4);
                    String s5 = c5.getString(5);
                    String s6 = c5.getString(6);
                    int z = Integer.parseInt(c5.getString(7));

                    ContentValues cv = new ContentValues();

                    cv.put(KEY_ID, n);
                    cv.put(KEY_QUESTION, s1);
                    cv.put(KEY_OPA, s2);
                    cv.put(KEY_OPB, s3);
                    cv.put(KEY_OPC, s4);
                    cv.put(KEY_OPD, s5);
                    cv.put(KEY_OPE, s6);
                    cv.put(KEY_CORRECT, z);
                    n++;

                    db.insert(KEY_TABLE_NAME, null, cv);
                }
            } while (c < 5);

            if (c5 != null && !c5.isClosed())
                c5.close();

            c = 0;
            a = random(1, 10);

            if (a[c] == 1)
                a[c] = 5;

            else if (a[c] == 2)
                a[c] = 10;

            else if (a[c] == 3)
                a[c] = 15;

            else if (a[c] == 4)
                a[c] = 20;

            else if (a[c] == 5)
                a[c] = 25;

            else if (a[c] == 6)
                a[c] = 30;

            else if (a[c] == 7)
                a[c] = 35;

            else if (a[c] == 8)
                a[c] = 40;

            else if (a[c] == 9)
                a[c] = 45;

            p = a[c] / 5;
            int y = a[c];
            if (c7.moveToPosition(p)) {

                do {
                    if (c6.moveToPosition(y)) {
                        c++;
                        y = a[0] + c;
                        String s1 = c6.getString(1);
                        String s2 = c6.getString(2);
                        String s3 = c6.getString(3);
                        String s4 = c6.getString(4);
                        String s5 = c6.getString(5);
                        String s6 = c6.getString(6);
                        s = c7.getString(1);
                        int z = Integer.parseInt(c6.getString(7));

                        ContentValues cv = new ContentValues();

                        cv.put(KEY_ID, n);
                        cv.put(KEY_QUESTION, s1);
                        cv.put(KEY_OPA, s2);
                        cv.put(KEY_OPB, s3);
                        cv.put(KEY_OPC, s4);
                        cv.put(KEY_OPD, s5);
                        cv.put(KEY_OPE, s6);
                        cv.put(KEY_CORRECT, z);
                        n++;

                        db.insert(KEY_TABLE_NAME, null, cv);
                    }
                } while (c < 5);
            }

            if (c6 != null && !c6.isClosed())
                c6.close();

            if (c7 != null && !c7.isClosed())
                c7.close();
        }
        db.close();
        cr.close();
    }

    @Override
    public void onClick(View v) {

        db = openOrCreateDatabase(KEY_DB, SQLiteDatabase.CREATE_IF_NECESSARY, null);
        Cursor c1 = db.query(KEY_TABLE_NAME, null, null, null, null, null, null);

        if (u[i] == 0)
            a[i] = -1;

        rg.clearCheck();

        if (z[i] == u[i] && u[i] != 0) {
            c[i] = 1;
        } else if (z[i] != u[i] && u[i] != 0) {
            c[i] = -1;
        }

        if (v == b2) {
            // Wait until scrollView is ready
            scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public void onGlobalLayout() {
                    // Ready, move up
                    scrollView.fullScroll(View.FOCUS_UP);
                    scrollView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
            if (i == 28) {
                b2.setText(R.string.submit);
            }

            if (i == 29) {
                Intent in = new Intent(this, Summary.class);
                Bundle b = new Bundle();

                b.putString(KEY_PARA, s);
                b.putIntArray(KEY_U, u);
                b.putIntArray(KEY_ATTEMPTED, a);
                b.putIntArray(KEY_CORRECT, c);
                b.putInt(KEY_I, i);
                b.putInt(KEY_INTERVAL, interval);
                b.putInt(KEY_MIN, min);
                b.putInt(KEY_SEC, sec);
                b.putChar(KEY_TEST, 'a');
                in.putExtras(b);
                startActivity(in);
            }

            if (!c1.isAfterLast() && c1.moveToPosition(i + 1)) {
                c1.moveToPosition(i + 1);
                ++i;
                y = Integer.parseInt(c1.getString(0));

                if (i == 25 || i == 26 || i == 27 || i == 28 || i == 29) {
                    tv2.setMovementMethod(new ScrollingMovementMethod());
                    tv2.setText(String.format(getString(R.string.para_placeholder), s, c1.getString(1)));
                } else {
                    tv2.setMovementMethod(new ScrollingMovementMethod());
                    tv2.setText(c1.getString(1));
                }

                rb1.setText(c1.getString(2));
                rb2.setText(c1.getString(3));
                rb3.setText(c1.getString(4));
                rb4.setText(c1.getString(5));
                rb5.setText(c1.getString(6));

                z[i] = Integer.parseInt(c1.getString(7));
            }
        } else if (v == b1) {
            // Wait until my scrollView is ready
            scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public void onGlobalLayout() {
                    // Ready, move up
                    scrollView.fullScroll(View.FOCUS_UP);
                    scrollView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
            if (b2.getText().toString().equals(getString(R.string.submit))) {
                b2.setText(R.string.next);
            }

            if (c1.moveToPosition(i - 1)) {
                c1.moveToPosition(i - 1);
                --i;
                y = Integer.parseInt(c1.getString(0));

                if (i == 24 || i == 25 || i == 26 || i == 27 || i == 28) {
                    tv2.setMovementMethod(new ScrollingMovementMethod());
                    tv2.setText(String.format(getString(R.string.para_placeholder), s, c1.getString(1)));
                } else {
                    tv2.setMovementMethod(new ScrollingMovementMethod());
                    tv2.setText(c1.getString(1));
                }

                rb1.setText(c1.getString(2));
                rb2.setText(c1.getString(3));
                rb3.setText(c1.getString(4));
                rb4.setText(c1.getString(5));
                rb5.setText(c1.getString(6));

                if (c1.isBeforeFirst()) {
                    AlertDialog.Builder ad = new AlertDialog.Builder(this);
                    ad.setIcon(R.drawable.ic_warning_black_24dp);
                    ad.setTitle(getString(R.string.alert));
                    ad.setMessage(getString(R.string.first_ques));
                    ad.setNeutralButton("Ok", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    ad.show();
                }
            }
        } else {
            Intent in = new Intent(this, Summary.class);
            Bundle b = new Bundle();

            b.putString(KEY_PARA, s);
            b.putIntArray(KEY_U, u);
            b.putIntArray(KEY_ATTEMPTED, a);
            b.putIntArray(KEY_CORRECT, c);
            b.putInt(KEY_I, i);
            b.putInt(KEY_INTERVAL, interval);
            b.putInt(KEY_MIN, min);
            b.putInt(KEY_SEC, sec);
            b.putChar(KEY_TEST, 'a');
            in.putExtras(b);
            startActivity(in);
        }

        if (a[i] == 1) {
            if (u[i] == 1) {
                rb1.setChecked(true);
            } else if (u[i] == 2) {
                rb2.setChecked(true);
            } else if (u[i] == 3) {
                rb3.setChecked(true);
            } else if (u[i] == 4) {
                rb4.setChecked(true);
            } else if (u[i] == 5) {
                rb5.setChecked(true);
            }
        }
        if (sec < 10) {
            tv3.setText(String.format(getString(R.string.question_placeholder), y, ques));
            time.setText(String.format(getString(R.string.time_place_sec), min, sec));
        } else {
            tv3.setText(String.format(getString(R.string.question_placeholder), y, ques));
            time.setText(String.format(getString(R.string.time_placeholder), min, sec));
        }
        if (c1 != null && !c1.isClosed())
            c1.close();

        db.close();
    }

    @Override
    public void onCheckedChanged(RadioGroup rg, int rb) {
        if (rb == rb1.getId() && rb1.isChecked()) {
            a[y - 1] = 1;
            u[y - 1] = 1;
        } else if (rb == rb2.getId() && rb2.isChecked()) {
            a[y - 1] = 1;
            u[y - 1] = 2;
        } else if (rb == rb3.getId() && rb3.isChecked()) {
            a[y - 1] = 1;
            u[y - 1] = 3;
        } else if (rb == rb4.getId() && rb4.isChecked()) {
            a[y - 1] = 1;
            u[y - 1] = 4;
        } else if (rb == rb5.getId() && rb5.isChecked()) {
            a[y - 1] = 1;
            u[y - 1] = 5;
        }
        if (z[i] == u[i] && u[i] != 0) {
            c[i] = 1;
        } else if (z[i] != u[i] && u[i] != 0) {
            c[i] = -1;
        }
    }

}
