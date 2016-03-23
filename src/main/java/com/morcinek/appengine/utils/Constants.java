package com.morcinek.appengine.utils;

/**
 * Contains the client IDs and scopes for allowed clients consuming your API.
 */
public class Constants {
    public static final String WEB_CLIENT_ID = "813344529100-jrvu13qr2mehd6uke4a5o0oiop3cm7qp.apps.googleusercontent.com";
    public static final String ANDROID_CLIENT_ID = "813344529100-aqvj005pm8qr39rcdlhshiqel0ou0iut.apps.googleusercontent.com";
    public static final String IOS_CLIENT_ID = "replace this with your iOS client ID";
    public static final String ANDROID_AUDIENCE = WEB_CLIENT_ID;

    public static final String EMAIL_SCOPE = "https://www.googleapis.com/auth/userinfo.email";
}
