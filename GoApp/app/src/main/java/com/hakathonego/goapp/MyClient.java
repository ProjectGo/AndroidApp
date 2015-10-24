package com.hakathonego.goapp;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.Path;

/**
 * Created by ThinkPad on 24.10.2015.
 */
class MyClient {
    static private AllInterfaces client;
    private static final String servUrl = "http://projectgo-servergo.rhcloud.com/";
    private MyClient(){}
    public static AllInterfaces sharedInstance(){
        if(client == null){
            RestAdapter what = new RestAdapter.Builder().setEndpoint(servUrl).build();
            client = what.create(AllInterfaces.class);
        }
        return client;
    }
}
