package com.morcinek.pearapp.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.appengine.api.oauth.OAuthRequestException;
import com.google.appengine.api.users.User;
import com.googlecode.objectify.ObjectifyService;
import com.morcinek.pearapp.backend.model.UserItem;
import com.morcinek.pearapp.backend.utils.Constants;

import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.security.GeneralSecurityException;
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
        if (user == null) {
            throw new OAuthRequestException("");
        }
        UserItem userItem = new UserItem(name);
        ObjectifyService.ofy().save().entity(userItem).now();
        return userItem;
    }

    @ApiMethod(name = "users.list", path = "users", httpMethod = ApiMethod.HttpMethod.GET)
    public List<UserItem> getUsers(User user) throws OAuthRequestException, IOException, GeneralSecurityException {
        if (user == null) {
            throw new OAuthRequestException("");
        }
        return ObjectifyService.ofy().load().type(UserItem.class).list();
    }

    @ApiMethod(name = "users.identity", path = "users/me")
    public UserItem getMe(User user, HttpServletRequest request) throws OAuthRequestException, IOException {
        if (user == null) {
            throw new OAuthRequestException("");
        }
        UserItem userItem = new UserItem(user.getUserId(), user.getNickname());
        return userItem;
    }
}
