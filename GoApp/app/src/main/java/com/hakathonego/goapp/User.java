package com.hakathonego.goapp;

/**
 * Created by Артём on 24.10.2015.
 */
public class User {
    private String id = "";
    private String name = "";
    private String sername = "";

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getSername() {
        return sername;
    }
    public void setSername(String sername) {
        this.sername = sername;
    }
}
