package com.pairapp;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

import java.util.Date;

@Entity
public class MyBean {

    @Id
    public Long id;

    private String myData;

    public MyBean() {
    }

    public MyBean(String myData) {
        this.myData = myData;
    }

    public String getData() {
        return myData;
    }
}