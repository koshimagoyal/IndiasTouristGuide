package com.example.lenovo.indiastouristguide;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.SearchView;
import android.view.MenuInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Tourist extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private View delhi,goa,meghalaya,jk,uk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist);
        delhi=(View) findViewById(R.id.delhi) ;
        goa=(View) findViewById(R.id.goa) ;
        meghalaya=(View)findViewById(R.id.meghalaya);
        jk=(View)findViewById(R.id.kashmir);
        uk=(View)findViewById(R.id.uk);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        delhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                forwardDelhi();
            }

        });

        goa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                forwardGoa();
            }

        });

        jk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                forwardJK();
            }

        });

        uk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                forwardUK();
            }

        });

        meghalaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                forwardMegh();
            }

        });

    }


    public void forwardDelhi(){
        Intent my = new Intent(this,Delhi.class);
        startActivity(my);
    }

    public void forwardGoa(){
        Intent my = new Intent(this,Goa.class);
        startActivity(my);
    }

    public void forwardJK(){
        Intent my = new Intent(this,Jk.class);
        startActivity(my);
    }

    public void forwardUK(){
        Intent my = new Intent(this,Uk.class);
        startActivity(my);
    }

    public void forwardMegh(){
        Intent my = new Intent(this,Megh.class);
        startActivity(my);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tourist, menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;

        } else if (id == R.id.nav_login) {

            Intent my = new Intent(this,MyLogin.class);
            startActivity(my);

        } else if (id == R.id.nav_rate) {
            Intent my = new Intent(this,MyRate.class);
            startActivity(my);

        } else if (id == R.id.nav_share) {
            Intent my = new Intent(this,MyShare.class);
            startActivity(my);

        } else if (id == R.id.nav_feedback) {
            Intent my = new Intent(this,MyFeedback.class);
            startActivity(my);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
