package com.hakathonego.goapp;

import java.util.ArrayList;

/**
 * Created by Артём on 24.10.2015.
 */
public class User {
    public String id = null;
    public String service = null;
    public String name = null;
    public String sername = null;

    /**
     * for getting users list
     * @param id
     * @param service
     * @param name
     * @param sername
     */
    public User(String id, String service, String name, String sername){
        this.id = id;
        this.name = name;
        this.sername = sername;
        this.service = service;
    }

    public User(){}

    public static ArrayList<User> getUserList(ArrayList<String> vkIds){
        ArrayList<User> users = new ArrayList<>();
        //
        return users;
    }
}
