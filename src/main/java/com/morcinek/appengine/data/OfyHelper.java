package com.morcinek.appengine.data;

import com.googlecode.objectify.ObjectifyService;
import com.morcinek.appengine.model.UserItem;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * OfyHelper, a ServletContextListener, is setup in web.xml to run before a JSP is run.  This is
 * required to let JSP's access Ofy.
 **/
public class OfyHelper implements ServletContextListener {

    public void contextInitialized(ServletContextEvent event) {
        ObjectifyService.register(UserItem.class);
    }

    public void contextDestroyed(ServletContextEvent event) {
    }
}