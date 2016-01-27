package com.vb.aptiquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.widget.Button;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;

import com.beardedhen.androidbootstrap.BootstrapButton;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    BootstrapButton b, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (BootstrapButton) findViewById(R.id.button1);
        b.setOnClickListener(this);
        b2 = (BootstrapButton) findViewById(R.id.button2);
        b2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                startActivity(new Intent(MainActivity.this, About.class));
            }
        });
        SQLiteDatabase db;
        db = openOrCreateDatabase("project", SQLiteDatabase.CREATE_IF_NECESSARY, null);

        db.execSQL("create table if not exists sufficiency(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");
        db.execSQL("create table if not exists logic(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");
        db.execSQL("create table if not exists series(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");
        db.execSQL("create table if not exists corsen(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");
        db.execSQL("create table if not exists relation(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");
        db.execSQL("create table if not exists impsen(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");
        db.execSQL("create table if not exists theme(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");
        db.execSQL("create table if not exists comsen(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");
        db.execSQL("create table if not exists selword(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");
        db.execSQL("create table if not exists misc(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");
        db.execSQL("create table if not exists puzzle(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");
        db.execSQL("create table if not exists paragraph(Pid integer primary key,Paragraph text)");

        Cursor c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12;

        c1 = db.query("sufficiency", null, null, null, null, null, null);//cv1 to cv50
        c2 = db.query("logic", null, null, null, null, null, null);//cv51 to cv100
        c3 = db.query("series", null, null, null, null, null, null);//cv101 to cv150
        c4 = db.query("corsen", null, null, null, null, null, null);//cv151 to cv200
        c5 = db.query("relation", null, null, null, null, null, null);//cv201 to cv250
        c6 = db.query("impsen", null, null, null, null, null, null);//cv251 to cv300
        c7 = db.query("theme", null, null, null, null, null, null);//cv301 to cv322
        c8 = db.query("comsen", null, null, null, null, null, null);//cv323 to cv400
        c9 = db.query("selword", null, null, null, null, null, null);//cv401 to cv450
        c10 = db.query("misc", null, null, null, null, null, null);//cv451 to cv475 and cv526 to cv550
        c11 = db.query("puzzle", null, null, null, null, null, null);//cv476 to cv525
        c12 = db.query("paragraph", null, null, null, null, null, null);//cv551 to cv560

        if (c1.getCount() != 50 || c2.getCount() != 50 || c3.getCount() != 50 || c4.getCount() != 50 || c5.getCount() != 50 || c6.getCount() != 50 || c7.getCount() != 22 || c8.getCount() != 78 || c9.getCount() != 50 || c10.getCount() != 50 || c11.getCount() != 50 || c12.getCount() != 10) {
            c1.close();
            c2.close();
            c3.close();
            c4.close();
            c5.close();
            c6.close();
            c7.close();
            c8.close();
            c9.close();
            c10.close();
            c11.close();
            c12.close();
            db.close();

        }
    }

    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        AlertDialog.Builder ad = new AlertDialog.Builder(this, AlertDialog.THEME_DEVICE_DEFAULT_DARK);
        ad.setTitle("Confirm");
        ad.setMessage("Are you sure you want to quit this app?");
        ad.setIcon(android.R.drawable.stat_notify_error);
        ad.setNegativeButton("Ok", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
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
        if (v == b) {
            SQLiteDatabase db = openOrCreateDatabase("project", 0, null);
            db.execSQL("drop table if exists aptitest");
            db.execSQL("drop table if exists verbaltest");
            db.close();
            Intent in = new Intent(this, TestActivity.class);
            this.finish();
            startActivity(in);
        }
    }
}
