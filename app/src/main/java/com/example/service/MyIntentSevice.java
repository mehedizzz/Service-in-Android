package com.example.service;

import android.app.IntentService;
import android.content.Intent;
import android.nfc.Tag;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyIntentSevice extends IntentService {

    public MyIntentSevice() {
        super("Hello");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Log.d("mehedi",""+Thread.currentThread().getName());

    }
}
