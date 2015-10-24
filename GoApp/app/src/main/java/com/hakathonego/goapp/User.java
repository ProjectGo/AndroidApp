package com.hakathonego.goapp;

import java.util.ArrayList;

/**
 * Created by Артём on 24.10.2015.
 */
public class User {
    public String vkid = null;
    public String name = null;
    public String sername = null;

    /**
     * for getting users list
     * @param vkid
     * @param name
     * @param sername
     */
    public User(String vkid, String name, String sername){
        this.vkid = vkid;
        this.name = name;
        this.sername = sername;
    }

    public User(){}

    public static ArrayList<User> getUserList(ArrayList<String> vkIds){
        ArrayList<User> users = new ArrayList<>();
        //
        return users;
    }
}
