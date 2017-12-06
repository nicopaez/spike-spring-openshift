POC: Sprint-Boot + Docker + Openshift
=====================================

Requirements:
* Java 8 SDK
* Maven 3

To build: mvn clean package

To run: mvn spring-boot:run (then browse http://localhost:8080)

Working with Docker
-------------------

Build the image (after building the jar): docker build -t miclaro-webapp .

Start a container: docker run -p 8080:8080 -d miclaro-webapp
