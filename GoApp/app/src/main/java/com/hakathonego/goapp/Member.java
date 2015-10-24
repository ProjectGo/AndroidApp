package com.hakathonego.goapp;

/**
 * Created by Артём on 24.10.2015.
 */
public class Member extends User{
    public Desision desision = null;

    /**
     * for getting event
     * @param id
     * @param service
     * @param name
     * @param sername
     * @param desision
     */
    public Member(String id, String service, String name, String sername, Desision desision){
        this.id = id;
        this.service = service;
        this.name = name;
        this.sername = sername;
        this.desision = desision;
    }

    public Member(){}

}
