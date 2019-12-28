package com.example.beatniktechnology.arla;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIME = 2000;

    int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();
            }
        });

        thread.start();


    }

    public void doWork() {

        for (progress = 1; progress <= 100; progress = progress + 1) {
            try {
                Thread.sleep(30);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private void startApp() {

        Intent intent = new Intent(SplashScreen.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
