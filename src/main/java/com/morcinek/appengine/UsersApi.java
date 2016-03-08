package com.morcinek.appengine;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.googlecode.objectify.ObjectifyService;
import com.morcinek.appengine.model.User;

import javax.inject.Named;
import java.util.List;

/**
 * Copyright 2016 Tomasz Morcinek. All rights reserved.
 */
@Api(name = "appengine",
        version = "v1",
        namespace = @ApiNamespace(ownerDomain = "appengine.morcinek.com",
                ownerName = "appengine.morcinek.com",
                packagePath = ""))
public class UsersApi {

    @ApiMethod(name = "users.add", path = "users/new", httpMethod = ApiMethod.HttpMethod.POST)
    public User addUser(@Named("name") String name) {
        User user = new User(name);
        ObjectifyService.ofy().save().entity(user).now();
        return user;
    }

    @ApiMethod(name = "users.collection", path = "users", httpMethod = ApiMethod.HttpMethod.GET)
    public List<User> getUsers() {
        return ObjectifyService.ofy().load().type(User.class).list();
    }
}
