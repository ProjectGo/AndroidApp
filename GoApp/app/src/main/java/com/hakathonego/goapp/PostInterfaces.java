package com.hakathonego.goapp;

/**
 * Created by ThinkPad on 24.10.2015.
 */
import org.json.JSONObject;

import retrofit.http.Body;
import retrofit.http.POST;

public interface PostInterfaces {
    @POST("url")
    void postEvent(@Body Event event);
}
