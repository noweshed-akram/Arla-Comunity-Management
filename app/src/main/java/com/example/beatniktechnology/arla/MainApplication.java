package com.example.beatniktechnology.arla;

import android.app.Application;
import android.content.Context;

import com.example.beatniktechnology.arla.Helper.LocalHelper;

public class MainApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocalHelper.onAttach(base,"en"));
    }
}
