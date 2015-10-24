package com.hakathonego.goapp;
import retrofit.Callback;
import retrofit.client.Response;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;



/**
 * Created by ThinkPad on 24.10.2015.
 */
public interface GetInterfaces {
    @GET("url")
    void getEventList(Callback<Response> callback);

    @GET("/event/{id}")
    void getEventId(Callback<Response> callback);

    @GET("/my_api/shop_list")
    void getPostEvent(@Path("event") Event event, Callback<Response> callback);

    @GET("/")
    void getGroupList(Callback<Response> callback);

    @GET("/")
    void getGroup(Callback<Response> callback);

}
