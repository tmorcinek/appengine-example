package com.morcinek.pearapp.backend.model;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

/**
 * Copyright 2016 Tomasz Morcinek. All rights reserved.
 */
@Entity
public class UserItem {

    @Id
    public Long id;

    private String googleId;

    private String name;

    public UserItem() {
    }

    public UserItem(String name) {
        this.name = name;
    }

    public UserItem(String googleId, String name) {
        this.googleId = googleId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getGoogleId() {
        return googleId;
    }
}