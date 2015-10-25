package com.hakathonego.goapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Toast;

import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKAccessTokenTracker;
import com.vk.sdk.VKSdk;


public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();

        VKSdk.initialize(this).withPayments();
        Intent intent = new Intent(Application.this, LoginActivity.class);
    }
}