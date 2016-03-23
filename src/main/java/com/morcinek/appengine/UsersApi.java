package com.morcinek.appengine;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.appengine.api.oauth.OAuthRequestException;
import com.google.appengine.api.users.User;
import com.googlecode.objectify.ObjectifyService;
import com.morcinek.appengine.model.UserItem;
import com.morcinek.appengine.utils.Constants;

import javax.inject.Named;
import java.io.IOException;
import java.util.List;

/**
 * Copyright 2016 Tomasz Morcinek. All rights reserved.
 */
@Api(name = "appengine",
        version = "v1",
        scopes = {Constants.EMAIL_SCOPE},
        clientIds = {Constants.WEB_CLIENT_ID, Constants.ANDROID_CLIENT_ID},
        audiences = {Constants.ANDROID_AUDIENCE}
)
public class UsersApi {

    @ApiMethod(name = "users.add", path = "users", httpMethod = ApiMethod.HttpMethod.POST)
    public UserItem addUser(@Named("name") String name, User user) throws OAuthRequestException, IOException {
        UserItem userItem = new UserItem(name);
        ObjectifyService.ofy().save().entity(userItem).now();
        return userItem;
    }

    @ApiMethod(name = "users.list", path = "users", httpMethod = ApiMethod.HttpMethod.GET)
    public List<UserItem> getUsers(User user) throws OAuthRequestException, IOException {
        return ObjectifyService.ofy().load().type(UserItem.class).list();
    }

    @ApiMethod(name = "users.identity", path = "users/me")
    public User getMe(User user) throws OAuthRequestException, IOException {
        return user;
    }
}
