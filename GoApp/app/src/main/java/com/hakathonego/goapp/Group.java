package com.hakathonego.goapp;

import org.parceler.Parcel;

import java.util.ArrayList;

/**
 * Created by Артём on 24.10.2015.
 */
public class Group {
    public String id = null;
    public String name = null;
    public ArrayList<User> users = null;

    /**
     * for getting list
     * @param groupId
     */
    public Group(String groupId, String name){
        this.id = groupId;
        this.name = name;
    }

    /**
     * for posting
     * @param name
     * @param users
     */
    public Group(String name, ArrayList<User> users){
        this.name = name;
        this.users = users;
    }


    public Group(){}
}
