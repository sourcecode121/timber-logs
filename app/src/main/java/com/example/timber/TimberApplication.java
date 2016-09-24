package com.example.timber;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by Anand on 24/09/2016.
 */
public class TimberApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());
    }
}
