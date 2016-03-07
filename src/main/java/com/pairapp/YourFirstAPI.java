package com.pairapp;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/**
  * Add your first API methods in this class, or you may create another class. In that case, please
  * update your web.xml accordingly.
 **/
@Api(name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(ownerDomain = "pairapp.com",
                ownerName = "pairapp.com",
                packagePath=""))
public class YourFirstAPI {


    @ApiMethod(name = "sayHi", httpMethod = "POST")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();
        response.setData("Hi, " + name);

        return response;
    }

    @ApiMethod(name = "getHi", httpMethod = "GET")
    public MyBean getHi() {
        MyBean response = new MyBean();
        response.setData("Hi, Unknown");

        return response;
    }
}
