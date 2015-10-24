package com.hakathonego.goapp;
import java.util.List;

import retrofit.Callback;
import retrofit.client.Response;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.POST;
import retrofit.http.Path;
import retrofit.http.Query;



/**
 * Created by ThinkPad on 24.10.2015.
 */
public interface AllInterfaces {
    @GET("/")
    void getEventList(Callback<List<Event> > callback);

    @GET("/event/{id}")
    void getEventId(Callback<List<Member>> callback);

    @GET("/friends")
    void getFriends(@Header("token")String token,Callback<List<User>> callback);

    @GET("/my_api/shop_list")
    void getPostEvent(@Path("event") Event event, Callback<?> callback);

    @GET("/")
    void getGroupList(Callback<List<Group>> callback);

    @GET("/")
    void getGroup(Callback<Group> callback);

    @POST("")
    void postEvent(@Body Event event);

    @POST("")
    void postDecision(@Body Event event);

    @POST("/url")
    void postToken(@Body String token);

}
