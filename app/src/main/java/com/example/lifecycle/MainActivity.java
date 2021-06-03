package com.example.lifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivityLife", "调用onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivityLife", "调用onStart");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i("MainActivityLife", "调用onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivityLife", "调用onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivityLife", "调用onPause");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("MainActivityLife", "调用onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivityLife", "调用onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivityLife", "调用onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivityLife", "调用onRestart");
    }
}