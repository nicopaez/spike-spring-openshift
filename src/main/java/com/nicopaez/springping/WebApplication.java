package com.nicopaez.springping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class WebApplication {
  static final Logger logger = LoggerFactory.getLogger(WebApplication.class);

  public static void main(String[] args) {
    logger.info("Starting SpringPing app...");
    new WebApplication().configure().run(args);
  }

  private final SpringApplicationBuilder springApplication;

  public WebApplication(){
    springApplication = new SpringApplicationBuilder();
  }

  public SpringApplicationBuilder additionalSources(Object... sources) {
    springApplication.sources(sources);
    return springApplication;
  }


  public SpringApplicationBuilder configure() {
    springApplication
        .sources(WebApplication.class)
        .properties("spring.config.name=webapp");
    return springApplication;
  }
}
