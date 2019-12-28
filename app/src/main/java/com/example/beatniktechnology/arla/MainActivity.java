package com.example.beatniktechnology.arla;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.beatniktechnology.arla.Fragments.DanoMom;
import com.example.beatniktechnology.arla.Fragments.Deelac;
import com.example.beatniktechnology.arla.Helper.LocalHelper;

import java.util.Locale;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    TextView aboutus, eng,ban;
    private LinearLayout deelacHomeBtnTwo;
    ImageView deelacArrow, danoMomArrow, videoThumbHomeBTN, fab;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocalHelper.onAttach(newBase, "en"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

//        aboutus = findViewById(R.id.aboutusText);
        eng = findViewById(R.id.eng);
        ban = findViewById(R.id.ban);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Home()).commit();

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.openDrawer(GravityCompat.START);
            }
        });



        setSupportActionBar(toolbar);


        setTitle("Home");


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



        /*// Language Convert

        String language = Paper.book().read("language");
        if (language==null){
            Paper.book().write("language","en");
        }

        updateView((String)Paper.book().read("language"));
        */// end


    }

    private void setAppLocale(String localcode) {
        Resources resources = getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            configuration.setLocale(new Locale(localcode.toLowerCase()));
        } else {
            configuration.locale = new Locale(localcode.toLowerCase());
        }

        resources.updateConfiguration(configuration, dm);
    }

    /*
        private void updateView(String lang){
            Context context = LocalHelper.setLocale(this,lang);
            Resources resources = context.getResources();

            aboutus.setText(resources.getString(R.string.about));
        }
    */
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

        switch (item.getItemId()) {

            case R.id.nav_home:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Home()).commit();

                break;

            case R.id.nav_deelac:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Deelac()).commit();
                break;

            case R.id.nav_DanoMom:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new DanoMom()).commit();
                break;

            case R.id.ban:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Home()).commit();
                setAppLocale("bn");
                break;

            case R.id.eng:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Home()).commit();

                setAppLocale("en");
                break;

            default:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Home()).commit();
        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
