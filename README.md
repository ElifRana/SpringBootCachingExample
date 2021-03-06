# SpringBootCachingExample


> This is Caching Programming Example>

<img src="https://github.com/ElifRana/SpringBootCachingExample/blob/master/cache.jpg" width="100%" height="100%"/>
     
## Prerequisites

* H2 Database

## Installation

```sh
mvn clean package

java -jar .target\SpringBootCachingExample-0.0.1-SNAPSHOT.jar
```

## Used Technologies

* Spring Boot 2.5.5
* Spring Boot Validation
* Spring Boot Jpa
* Spring Boot Cache
* H2 Database
* Lombok
* Swagger

http://localhost:8080/swagger-ui.html

<img src="https://github.com/ElifRana/SpringBootCachingExample/blob/master/SwaggerCache.png" width="100%" height="100%"/> 

* The first time the Getall operation is performed, it pulls the data from the database. As can be seen, this process took 3.33 s.
* But when the second getall request is made, it pulls the data faster from the memory thanks to the cache. This process took 8 ms thanks to caching.
