FROM openjdk:8-jre-alpine

RUN mkdir -p /var/www/springping

ADD ./target/springping.jar /var/www/springping

WORKDIR /var/www/springping

EXPOSE 8080

CMD ["java","-Djava.security.egd=file:/dev/./urandom", "-Dserver.port=8080", "-jar", "springping.jar"]