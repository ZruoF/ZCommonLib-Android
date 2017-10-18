package com.example.zengruofan.zcommonlib;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by zengruofan on 17/10/18.
 */

public class App extends Application {
    private static App sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        Fresco.initialize(this);
    }

    public static App getInstance() {
        return sInstance;
    }
}
