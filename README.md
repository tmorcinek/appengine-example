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


Developed By
--------

Tomasz Morcinek - http://morcinek.co.uk

<a href="https://plus.google.com/+TomaszMorcinek">
  <img alt="Follow me on Google+"
       src="https://dl.dropboxusercontent.com/u/86831510/google-plus-logo.png" />
</a>
<a href="https://www.linkedin.com/in/tmorcinek">
  <img alt="Follow me on LinkedIn"
       src="https://dl.dropboxusercontent.com/u/86831510/linkedin-logo.png" />
</a>
<a href="https://play.google.com/store/apps/developer?id=Tomasz+Morcinek">
  <img alt="Checkout my Applications in Google Play"
       src="https://dl.dropboxusercontent.com/u/86831510/google-play-logo.png" />
</a>
