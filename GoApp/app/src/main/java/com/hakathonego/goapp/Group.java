package com.hakathonego.goapp;

import java.util.ArrayList;

/**
 * Created by Артём on 24.10.2015.
 */
public class Group {
    private String name = "";
    private ArrayList<User> users = new ArrayList<>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void addUser(User user){
        users.add(user);
    }
    public void deleteUser(int index){
        users.remove(index);
    }
}
