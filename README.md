# microservice_logging
Spring Boot Microservices, Kotlin, Sleuth, elesticsearch, zipkin, actuator

This Repository contains several microservices which depands on each other.
The goal is to show how to configure Spring microservices for monitoring and logging their metrics, api or stack traces.

## Services

### Frontend Service
First Service, contains a simple api interface which can called from outside. This Service is depend on the processor
service. Each API call will be redirected to the processor service.

### Processor Service
This Service represents a business logic service. The latency of this service can be slower and will be implemented by
a random timeout. As the frontend service is the processor service depend an the database server. Each incoming request
will be redirected to the database service.

### Database Service
The Database Service represents an entity service, which will store the data into a database.


## General

Each Service implements the sleuth and the zipkin client. 

## Goal

This repository is a playground for sleuth/actuator/elesticsearch/etc.
Feel free to to fork this project and play around with your own configuration.