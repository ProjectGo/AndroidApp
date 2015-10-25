package com.hakathonego.goapp;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Артём on 24.10.2015.
 */
@Parcel(Parcel.Serialization.BEAN)
public class Event {
    public String id = null;
    public String description = null;
    public String place = null;
    public ArrayList<Member> members = null;
    public String groupid = null;
    public String dateTime = null;

    public Event(){}

    /**
     * for getting list
     * @param id
     * @param description
     * @param dateTime
     */
    public Event(String id,String description, String dateTime){
        this.dateTime = dateTime;
        this.description = description;
        this.id = id;
        this.dateTime = dateTime;
    }

    /**
     * for posting
     * @param description
     * @param place
     * @param dateTime
     * @param groupid
     */
    public Event(String description, String place, String dateTime, String groupid){
        this.dateTime = dateTime;
        this.description = description;
        this.place = place;
        this.groupid = groupid;

    }
}


