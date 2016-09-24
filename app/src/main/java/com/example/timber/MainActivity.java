package com.example.timber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Timber.v("First msg");
        Timber.d("Second msg");
        Timber.i("Third msg");
        Timber.w("Fourth msg");
        Timber.e("Fifth msg");
    }
}
