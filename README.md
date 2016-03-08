appengine-example
==================


Description
-------

Sample demonstrates how to create an application on Google App Engine. Project show:
- how to create endpoints for methods: POST and GET
- how to create database using Objectify, SAVE and LOAD entities from that database.


Running
-------

```
$ mvn appengine:devserver
```


Testing
-------

**Adding new User**
```
POST http://localhost:8080/_ah/api/appengine/v1/users/new?name=Grzesiek
```

**Getting all Users**
```
GET http://localhost:8080/_ah/api/appengine/v1/users
```


Reference
-------

- https://developers.google.com/appengine
- http://java.com/en/
- https://developers.google.com/appengine/docs/java/endpoints/
- https://developers.google.com/appengine/docs/java/tools/maven
- https://console.developers.google.com/
- https://github.com/objectify/objectify
