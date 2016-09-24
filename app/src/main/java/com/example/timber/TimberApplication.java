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

        if(BuildConfig.DEBUG){
            Timber.plant(new Timber.DebugTree(){
                // Add line numbers to the tag
                @Override
                protected String createStackElementTag(StackTraceElement element) {
                    return super.createStackElementTag(element) + ":" + element.getLineNumber();
                }
            });
        }
        else {
            // Release mode
            Timber.plant(new ReleaseTree());
        }

    }
}
