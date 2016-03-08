package com.morcinek.appengine.model;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

/**
 * Copyright 2016 Tomasz Morcinek. All rights reserved.
 */
@Entity
public class User {

    @Id
    public Long id;

    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}