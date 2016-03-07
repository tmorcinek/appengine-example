package com.pairapp;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Add your first API methods in this class, or you may create another class. In that case, please
 * update your web.xml accordingly.
 **/
@Api(name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(ownerDomain = "pairapp.com",
                ownerName = "pairapp.com",
                packagePath = ""))
public class YourFirstAPI {

    private List<MyBean> beans = new ArrayList<>();


    @ApiMethod(name = "users.add", path = "users/new", httpMethod = ApiMethod.HttpMethod.POST)
    public MyBean addBean(@Named("name") String name) {
        MyBean response = new MyBean("Hi, " + name);
        beans.add(response);
        return response;
    }

    @ApiMethod(name = "users.collection", path = "users",httpMethod = ApiMethod.HttpMethod.GET)
    public List<MyBean> getBeans() {
        return beans;
    }
}
