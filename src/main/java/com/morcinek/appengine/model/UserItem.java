package com.morcinek.appengine.model;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

/**
 * Copyright 2016 Tomasz Morcinek. All rights reserved.
 */
@Entity
public class UserItem {

    @Id
    public Long id;

    private String name;

    public UserItem() {
    }

    public UserItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}