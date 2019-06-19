# Spring-Microservices


## Microservices

 - Limits service
 - Spring cloud config server
 - Currency conversion Service
 - Currency Exchange Service

## Implementation

 - Communication between Microservices
 - Centralized Microservice Configuration with Spring Cloud Config Server
 - Simplify communication with other Microservices using Feign REST Client
 - Implemented client side load balancing with Ribbon
 - Implemented dynamic scaling using Eureka Naming Server and Ribbon
 - Implemented API Gateway with Zuul
 - Implemented Distributed tracing with Spring Cloud Sleuth and Zipkin
 - Implemented Fault Tolerance with Zipkin

## RESTful web service end-points

 - Retrieve all users - GET /users
 - Create a user - POST /users
 - Retrieve one user - GET /users/{id}
 - Delete a user - DELETE /users/{id}


 - Retrieve all posts for a user - GET /users/{id}/posts
 - Create a post for a user - POST /users/{id}/posts
 - Retrieve details of a post - GET /users/{id}/posts/{post_id}


## Zipkin Installation
   
   Download Zipkin jar

    - https://search.maven.org/remote_content?g=io.zipkin.java&a=zipkin-server&v=LATEST&c=exec

   Command to run in Windows

   	  RABBIT_URI=amqp://localhost

   	  java -jar zipkin-server-2.12.9-exec.jar 

## VM Arguement

	-Dserver.port=8001

	