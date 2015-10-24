package com.hakathonego.goapp;

import java.util.Date;

/**
 * Created by Артём on 24.10.2015.
 */
public class Event {
    private String id = "";
    private String name = "";
    private Group group = null;
    private String dateTime = "";

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Group getGroup() {
        return group;
    }
    public void setGroup(Group group) {
        this.group = group;
    }
}


