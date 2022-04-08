package com.example.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(LOG_TAG, "Log level Verbose");
        Log.d(LOG_TAG, "Log level Debug");
        Log.i(LOG_TAG, "Log level Info");
        Log.w(LOG_TAG, "Log level Warn");
        Log.e(LOG_TAG, "Log level Error");
        Log.wtf(LOG_TAG, "Log level Assert");
    }
}