package com.mengasis.manuel.exampleandroidrealm.Models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by manuel on 19-04-17.
 */

public class Hero extends RealmObject{

    @PrimaryKey
    private int id;
    private String name;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
