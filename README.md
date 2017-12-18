POC: Sprint-Boot + Docker + Openshift
=====================================

Requirements:
* Java 8 SDK
* Maven 3

To build: mvn clean package

To run: mvn spring-boot:run (then browse http://localhost:8080)

IMPORTANT: the application loads the configuration from Spring Cloud Config, check the bootstrap.properties file.

Working with Docker
-------------------

Build the image (after building the jar): docker build -t springping .

Start a container: docker run -p 8080:8080 -d springping

Using Vagrant
-------------

A Vagrant configuration is provided for this project. Just clone the repo and run _vagrant up_.
The configuration includes:

* Java OpenJDK 8
* Maven 3
* Docker
* OpenShift Client tools
