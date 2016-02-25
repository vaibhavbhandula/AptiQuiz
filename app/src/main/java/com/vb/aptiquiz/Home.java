package com.vb.aptiquiz;

import android.content.Intent;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        apti = (com.getbase.floatingactionbutton.FloatingActionButton) findViewById(R.id.floatapti);
        apti.setOnClickListener(this);
        verb = (com.getbase.floatingactionbutton.FloatingActionButton) findViewById(R.id.floatverbal);
        verb.setOnClickListener(this);

        apti.setIcon(R.drawable.ic_assessment_white_24dp);
        apti.setSize(com.getbase.floatingactionbutton.FloatingActionButton.SIZE_MINI);

        verb.setIcon(R.drawable.ic_assignment_white_24dp);
        verb.setSize(com.getbase.floatingactionbutton.FloatingActionButton.SIZE_MINI);

        view = (LinearLayout) findViewById(R.id.transparent);
        fabMenu = (FloatingActionsMenu) findViewById(R.id.fabmenu);
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
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.getMenu().getItem(0).setChecked(true);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.apti) {
            // Handle the camera action
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
        } else if (v == verb) {
            Intent in = new Intent(this, VerbalTestMenu.class);
            startActivity(in);
        }
    }
}
