package com.vb.aptiquiz;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

import com.getbase.floatingactionbutton.FloatingActionsMenu;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {
    NavigationView navigationView;
    com.getbase.floatingactionbutton.FloatingActionButton apti, verb;
    LinearLayout view;
    FloatingActionsMenu fabMenu;

    SQLiteDatabase db;

    final static String KEY_ID = "Id";
    final static String KEY_CORRECT = "correct";
    final static String KEY_QUESTION = "Question";
    final static String KEY_OPA = "optiona";
    final static String KEY_OPB = "optionb";
    final static String KEY_OPC = "optionc";
    final static String KEY_OPD = "optiond";
    final static String KEY_OPE = "optione";
    final static String KEY_DB = "project";
    final static String KEY_MISC = "misc";
    final static String KEY_RELATION = "relation";
    final static String KEY_LOGIC = "logic";
    final static String KEY_SUFFICIENCY = "sufficiency";
    final static String KEY_SERIES = "series";
    final static String KEY_PUZZLE = "puzzle";
    final static String KEY_COMSEN = "comsen";
    final static String KEY_THEME = "theme";
    final static String KEY_CORSEN = "corsen";
    final static String KEY_IMPSEN = "impsen";
    final static String KEY_SELWORD = "selword";
    final static String KEY_PARA = "paragraph";
    final static String KEY_PID = "Pid";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        apti = (com.getbase.floatingactionbutton.FloatingActionButton) findViewById(R.id.floatApti);
        apti.setOnClickListener(this);
        verb = (com.getbase.floatingactionbutton.FloatingActionButton) findViewById(R.id.floatVerbal);
        verb.setOnClickListener(this);

        apti.setIcon(R.drawable.ic_assessment_white_24dp);
        apti.setSize(com.getbase.floatingactionbutton.FloatingActionButton.SIZE_MINI);

        verb.setIcon(R.drawable.ic_assignment_white_24dp);
        verb.setSize(com.getbase.floatingactionbutton.FloatingActionButton.SIZE_MINI);

        view = (LinearLayout) findViewById(R.id.transparent);
        fabMenu = (FloatingActionsMenu) findViewById(R.id.fabMenu);
        fabMenu.setOnFloatingActionsMenuUpdateListener(new FloatingActionsMenu.OnFloatingActionsMenuUpdateListener() {
            @Override
            public void onMenuExpanded() {
                view.setClickable(true);
                view.setVisibility(View.VISIBLE);
            }

            @Override
            public void onMenuCollapsed() {
                view.setClickable(false);
                view.setVisibility(View.GONE);
            }
        });

        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                view.setClickable(false);
                view.setVisibility(View.GONE);
                fabMenu.toggle();
                return false;
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close) {

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                if (fabMenu.isExpanded()) {
                    view.setVisibility(View.GONE);
                    fabMenu.collapse();
                }
            }
        };

        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.getMenu().getItem(0).setChecked(true);

        setUpDB();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else if (fabMenu.isExpanded()) {
            view.setVisibility(View.GONE);
            fabMenu.collapse();
        } else {
            super.onBackPressed();
        }
    }


    void setUpDB() {
        db = openOrCreateDatabase(KEY_DB, SQLiteDatabase.CREATE_IF_NECESSARY, null);

        db.execSQL("create table if not exists " + KEY_SUFFICIENCY + "("
                + KEY_ID + " integer primary key,"
                + KEY_QUESTION + " text,"
                + KEY_OPA + " text,"
                + KEY_OPB + " text,"
                + KEY_OPC + " text,"
                + KEY_OPD + " text,"
                + KEY_OPE + " text,"
                + KEY_CORRECT + " text)");

        db.execSQL("create table if not exists " + KEY_LOGIC + "("
                + KEY_ID + " integer primary key,"
                + KEY_QUESTION + " text,"
                + KEY_OPA + " text,"
                + KEY_OPB + " text,"
                + KEY_OPC + " text,"
                + KEY_OPD + " text,"
                + KEY_OPE + " text,"
                + KEY_CORRECT + " text)");

        db.execSQL("create table if not exists " + KEY_SERIES + "("
                + KEY_ID + " integer primary key,"
                + KEY_QUESTION + " text,"
                + KEY_OPA + " text,"
                + KEY_OPB + " text,"
                + KEY_OPC + " text,"
                + KEY_OPD + " text,"
                + KEY_OPE + " text,"
                + KEY_CORRECT + " text)");

        db.execSQL("create table if not exists " + KEY_CORSEN + "("
                + KEY_ID + " integer primary key,"
                + KEY_QUESTION + " text,"
                + KEY_OPA + " text,"
                + KEY_OPB + " text,"
                + KEY_OPC + " text,"
                + KEY_OPD + " text,"
                + KEY_OPE + " text,"
                + KEY_CORRECT + " text)");

        db.execSQL("create table if not exists " + KEY_RELATION + "("
                + KEY_ID + " integer primary key,"
                + KEY_QUESTION + " text,"
                + KEY_OPA + " text,"
                + KEY_OPB + " text,"
                + KEY_OPC + " text,"
                + KEY_OPD + " text,"
                + KEY_OPE + " text,"
                + KEY_CORRECT + " text)");

        db.execSQL("create table if not exists " + KEY_IMPSEN + "("
                + KEY_ID + " integer primary key,"
                + KEY_QUESTION + " text,"
                + KEY_OPA + " text,"
                + KEY_OPB + " text,"
                + KEY_OPC + " text,"
                + KEY_OPD + " text,"
                + KEY_OPE + " text,"
                + KEY_CORRECT + " text)");

        db.execSQL("create table if not exists " + KEY_THEME + "("
                + KEY_ID + " integer primary key,"
                + KEY_QUESTION + " text,"
                + KEY_OPA + " text,"
                + KEY_OPB + " text,"
                + KEY_OPC + " text,"
                + KEY_OPD + " text,"
                + KEY_OPE + " text,"
                + KEY_CORRECT + " text)");

        db.execSQL("create table if not exists " + KEY_COMSEN + "("
                + KEY_ID + " integer primary key,"
                + KEY_QUESTION + " text,"
                + KEY_OPA + " text,"
                + KEY_OPB + " text,"
                + KEY_OPC + " text,"
                + KEY_OPD + " text,"
                + KEY_OPE + " text,"
                + KEY_CORRECT + " text)");

        db.execSQL("create table if not exists " + KEY_SELWORD + "("
                + KEY_ID + " integer primary key,"
                + KEY_QUESTION + " text,"
                + KEY_OPA + " text,"
                + KEY_OPB + " text,"
                + KEY_OPC + " text,"
                + KEY_OPD + " text,"
                + KEY_OPE + " text,"
                + KEY_CORRECT + " text)");

        db.execSQL("create table if not exists " + KEY_MISC + "("
                + KEY_ID + " integer primary key,"
                + KEY_QUESTION + " text,"
                + KEY_OPA + " text,"
                + KEY_OPB + " text,"
                + KEY_OPC + " text,"
                + KEY_OPD + " text,"
                + KEY_OPE + " text,"
                + KEY_CORRECT + " text)");

        db.execSQL("create table if not exists " + KEY_PUZZLE + "("
                + KEY_ID + " integer primary key,"
                + KEY_QUESTION + " text,"
                + KEY_OPA + " text,"
                + KEY_OPB + " text,"
                + KEY_OPC + " text,"
                + KEY_OPD + " text,"
                + KEY_OPE + " text,"
                + KEY_CORRECT + " text)");

        db.execSQL("create table if not exists " + KEY_PARA + "("
                + KEY_PID + " integer primary key,"
                + KEY_PARA + " text)");

        db.close();

    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.apti) {
            startActivity(new Intent(Home.this, AptitudeTestMenu.class));

        } else if (id == R.id.verb) {
            startActivity(new Intent(Home.this, VerbalTestMenu.class));

        } else if (id == R.id.about) {
            startActivity(new Intent(Home.this, About.class));

        } else if (id == R.id.nav_share) {
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Sub");
            sharingIntent.putExtra(Intent.EXTRA_TEXT, "text");
            startActivity(Intent.createChooser(sharingIntent, "Share Via"));
            navigationView.getMenu().getItem(0).setChecked(true);

        } else if (id == R.id.nav_rate) {
            navigationView.getMenu().getItem(0).setChecked(true);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View v) {
        if (v == apti) {
            Intent in = new Intent(this, AptitudeTestMenu.class);
            startActivity(in);
            view.setVisibility(View.GONE);
            fabMenu.collapse();
        } else if (v == verb) {
            Intent in = new Intent(this, VerbalTestMenu.class);
            startActivity(in);
            view.setVisibility(View.GONE);
            fabMenu.collapse();
        }
    }
}
