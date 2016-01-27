package com.vb.aptiquiz;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.app.AlertDialog;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.beardedhen.androidbootstrap.BootstrapButton;


public class Aptitude extends AppCompatActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {
    TextView tv1, tv2, tv3;
    BootstrapButton b1, b2, b3;
    RadioGroup rg;
    RadioButton rb1, rb2, rb3, rb4, rb5;


    int i = 0, flag = 0, p, flag1 = 0, y;
    char ch;
    String s;

    static Timer timer;
    int sec = 0;
    int min = 40;
    static int interval;
    int z[] = new int[30], u[] = new int[30], a[] = new int[30], c[] = new int[30];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude);
        tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);

        rg = (RadioGroup) findViewById(R.id.radioGroup1);
        rb1 = (RadioButton) findViewById(R.id.radio0);
        rb2 = (RadioButton) findViewById(R.id.radio1);
        rb3 = (RadioButton) findViewById(R.id.radio2);
        rb4 = (RadioButton) findViewById(R.id.radio3);
        rb5 = (RadioButton) findViewById(R.id.radio4);
        rg.setOnCheckedChangeListener(this);

        b1 = (BootstrapButton) findViewById(R.id.button1);
        b1.setOnClickListener(this);

        b2 = (BootstrapButton) findViewById(R.id.button2);
        b2.setOnClickListener(this);

        b3 = (BootstrapButton) findViewById(R.id.button3);
        b3.setOnClickListener(this);

        DisplayMetrics displayMetrics = getBaseContext().getResources().getDisplayMetrics();

        float dpHeight = displayMetrics.heightPixels / displayMetrics.density;
        float dpWidth = displayMetrics.widthPixels / displayMetrics.density;


        timing();

        if (getIntent().getExtras() != null) {

            Intent in = getIntent();
            Bundle b = in.getExtras();

            if (b.getChar("load") == 'n') {
                interval = b.getInt("interval");
                loadQuestion(b.getInt("i"), b);
                flag1 = 1;
                flag = 1;
            } else if (b.getChar("load") == 'y') {
                interval = b.getInt("interval");
                loadQuestion(b.getInt("no."), b);
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
        // TODO Auto-generated method stub
        AlertDialog.Builder ad = new AlertDialog.Builder(this, R.style.AppCompatAlertDialogStyle);
        ad.setTitle("Confirm");
        ad.setMessage("Are you sure you want to quit this app?");
        ad.setIcon(android.R.drawable.stat_notify_error);
        ad.setNegativeButton("Ok", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
                SQLiteDatabase db = openOrCreateDatabase("project", 0, null);
                db.execSQL("drop table if exists aptitest");
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

    public void loadFirst() {
        SQLiteDatabase db;
        db = openOrCreateDatabase("project", SQLiteDatabase.CREATE_IF_NECESSARY, null);
        Cursor c = db.query("aptitest", null, null, null, null, null, null);

        if (c.moveToFirst()) {
            y = Integer.parseInt(c.getString(0));

            tv2.setMovementMethod(new ScrollingMovementMethod());
            tv2.setText("" + c.getString(1));
            rb1.setText(c.getString(2));
            rb2.setText(c.getString(3));
            rb3.setText(c.getString(4));
            rb4.setText(c.getString(5));
            rb5.setText(c.getString(6));
            z[i] = Integer.parseInt(c.getString(7));

            if (flag == 1) {
                Intent in = getIntent();
                Bundle b = in.getExtras();

                u = b.getIntArray("u");
                i = b.getInt("i");

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
            tv3.setText("Question " + y + " of 30" + "\nTimer : " + min + " : " + "0" + sec);
        } else {
            tv3.setText("Question " + y + " of 30" + "\nTimer : " + min + " : " + sec);
        }

        if (sec == 0) {
            min--;
            sec = 60;
        }

        sec--;

        if (interval == 0) {
            timer.cancel();
            ProgressDialog pd = ProgressDialog.show(Aptitude.this, "Submitting test", "Please Wait...");
            new Thread(new Runnable() {

                @Override
                public void run() {
                    // TODO Auto-generated method stub
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }).start();

            Intent in = new Intent(Aptitude.this, Result.class);
            Bundle b = new Bundle();

            b.putIntArray("u", u);
            b.putIntArray("attempted", a);
            b.putIntArray("correct", c);
            b.putString("paragraph", s);
            b.putChar("test", 'a');
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

        SQLiteDatabase db;
        db = openOrCreateDatabase("project", SQLiteDatabase.CREATE_IF_NECESSARY, null);
        Cursor c = db.query("aptitest", null, null, null, null, null, null);

        if (b.getIntArray("u") != null) {
            s = b.getString("paragraph");
            u = b.getIntArray("u");
            a = b.getIntArray("attempted");
            this.c = b.getIntArray("correct");
            ch = b.getChar("test");
            min = b.getInt("min");
            sec = b.getInt("sec");
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
                tv2.setText("Paragraph:\n" + s + "\n\n" + "Q. " + s1);
            } else {
                tv2.setMovementMethod(new ScrollingMovementMethod());
                tv2.setText("" + s1);
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
    }

    public void loadTest(int m) {
        int a[] = new int[m];
        SQLiteDatabase db;
        db = openOrCreateDatabase("project", SQLiteDatabase.CREATE_IF_NECESSARY, null);

        db.execSQL("create table if not exists aptitest(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");
        Cursor cr = db.query("aptitest", null, null, null, null, null, null);

        if (cr.getCount() != 30) {

            Cursor c1 = db.query("misc", null, null, null, null, null, null);
            Cursor c2 = db.query("relation", null, null, null, null, null, null);
            Cursor c3 = db.query("logic", null, null, null, null, null, null);
            Cursor c4 = db.query("sufficiency", null, null, null, null, null, null);
            Cursor c5 = db.query("series", null, null, null, null, null, null);
            Cursor c6 = db.query("puzzle", null, null, null, null, null, null);
            Cursor c7 = db.query("paragraph", null, null, null, null, null, null);

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

                    cv.put("Id", n);
                    cv.put("Question", s1);
                    cv.put("optiona", s2);
                    cv.put("optionb", s3);
                    cv.put("optionc", s4);
                    cv.put("optiond", s5);
                    cv.put("optione", s6);
                    cv.put("correct", z);
                    n++;

                    db.insert("aptitest", null, cv);
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

                    cv.put("Id", n);
                    cv.put("Question", s1);
                    cv.put("optiona", s2);
                    cv.put("optionb", s3);
                    cv.put("optionc", s4);
                    cv.put("optiond", s5);
                    cv.put("optione", s6);
                    cv.put("correct", z);
                    n++;

                    db.insert("aptitest", null, cv);
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

                    cv.put("Id", n);
                    cv.put("Question", s1);
                    cv.put("optiona", s2);
                    cv.put("optionb", s3);
                    cv.put("optionc", s4);
                    cv.put("optiond", s5);
                    cv.put("optione", s6);
                    cv.put("correct", z);
                    n++;

                    db.insert("aptitest", null, cv);
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

                    cv.put("Id", n);
                    cv.put("Question", s1);
                    cv.put("optiona", s2);
                    cv.put("optionb", s3);
                    cv.put("optionc", s4);
                    cv.put("optiond", s5);
                    cv.put("optione", s6);
                    cv.put("correct", z);
                    n++;

                    db.insert("aptitest", null, cv);
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

                    cv.put("Id", n);
                    cv.put("Question", s1);
                    cv.put("optiona", s2);
                    cv.put("optionb", s3);
                    cv.put("optionc", s4);
                    cv.put("optiond", s5);
                    cv.put("optione", s6);
                    cv.put("correct", z);
                    n++;

                    db.insert("aptitest", null, cv);
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

                        cv.put("Id", n);
                        cv.put("Question", s1);
                        cv.put("optiona", s2);
                        cv.put("optionb", s3);
                        cv.put("optionc", s4);
                        cv.put("optiond", s5);
                        cv.put("optione", s6);
                        cv.put("correct", z);
                        n++;

                        db.insert("aptitest", null, cv);
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
        // TODO Auto-generated method stub

        SQLiteDatabase db;
        db = openOrCreateDatabase("project", SQLiteDatabase.CREATE_IF_NECESSARY, null);
        Cursor c1 = db.query("aptitest", null, null, null, null, null, null);

        if (u[i] == 0)
            a[i] = -1;

        rg.clearCheck();

        if (z[i] == u[i] && u[i] != 0) {
            c[i] = 1;
        } else if (z[i] != u[i] && u[i] != 0) {
            c[i] = -1;
        }

        if (v == b2) {
            if (i == 28) {
                b2.setText(R.string.submit);
            }

            if (i == 29) {
                Intent in = new Intent(this, Result1.class);
                Bundle b = new Bundle();

                b.putString("paragraph", s);
                b.putIntArray("u", u);
                b.putIntArray("attempted", a);
                b.putIntArray("correct", c);
                b.putInt("i", i);
                b.putInt("interval", interval);
                b.putInt("min", min);
                b.putInt("sec", sec);
                b.putChar("test", 'a');
                in.putExtras(b);
                startActivity(in);
            }

            if (!c1.isAfterLast() && c1.moveToPosition(i + 1)) {
                c1.moveToPosition(i + 1);
                ++i;
                y = Integer.parseInt(c1.getString(0));

                if (i == 25 || i == 26 || i == 27 || i == 28 || i == 29) {
                    tv2.setMovementMethod(new ScrollingMovementMethod());
                    tv2.setText("Paragraph:\n" + s + "\n\n" + "Q. " + c1.getString(1));
                } else {
                    tv2.setMovementMethod(new ScrollingMovementMethod());
                    tv2.setText("" + c1.getString(1));
                }

                rb1.setText(c1.getString(2));
                rb2.setText(c1.getString(3));
                rb3.setText(c1.getString(4));
                rb4.setText(c1.getString(5));
                rb5.setText(c1.getString(6));

                z[i] = Integer.parseInt(c1.getString(7));
            }
        } else if (v == b1) {
            if (b2.getText().toString().equals("Submit")) {
                b2.setText(R.string.next);
            }

            if (c1.moveToPosition(i - 1)) {
                c1.moveToPosition(i - 1);
                --i;
                y = Integer.parseInt(c1.getString(0));

                if (i == 24 || i == 25 || i == 26 || i == 27 || i == 28) {
                    tv2.setMovementMethod(new ScrollingMovementMethod());
                    tv2.setText("Paragraph:" + "\n" + s + "\n\n" + "Q. " + c1.getString(1));
                } else {
                    tv2.setMovementMethod(new ScrollingMovementMethod());
                    tv2.setText("" + c1.getString(1));
                }

                rb1.setText(c1.getString(2));
                rb2.setText(c1.getString(3));
                rb3.setText(c1.getString(4));
                rb4.setText(c1.getString(5));
                rb5.setText(c1.getString(6));

                if (c1.isBeforeFirst()) {
                    AlertDialog.Builder ad = new AlertDialog.Builder(this);
                    ad.setTitle("Alert");
                    ad.setMessage("This is the first question ! Click Next to view more.");
                    ad.setNeutralButton("Ok", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // TODO Auto-generated method stub
                        }
                    });
                    ad.show();
                }
            }
        } else {
            Intent in = new Intent(this, Result1.class);
            Bundle b = new Bundle();

            b.putString("paragraph", s);
            b.putIntArray("u", u);
            b.putIntArray("attempted", a);
            b.putIntArray("correct", c);
            b.putInt("i", i);
            b.putInt("interval", interval);
            b.putInt("min", min);
            b.putInt("sec", sec);
            b.putChar("test", 'a');
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
            tv3.setText("Question " + y + " of 30" + "\nTimer : " + min + " : " + "0" + sec);
        } else {
            tv3.setText("Question " + y + " of 30" + "\nTimer : " + min + " : " + sec);
        }
        if (c1 != null && !c1.isClosed())
            c1.close();

        db.close();
    }

    @Override
    public void onCheckedChanged(RadioGroup rg, int rb) {
        // TODO Auto-generated method stub
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
