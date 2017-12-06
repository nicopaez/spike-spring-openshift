package com.nicopaez.springping.model;

import com.nicopaez.springping.config.Parameters;

import java.time.LocalDateTime;

public class ApplicationData {

  String appName;
  String appVersion;
  String systemValue;
  String value1;
  String value2;
  LocalDateTime time;

  public ApplicationData(){
    appName = "Proof of concept Spring-Boot, Docker and OpenShift";
    time = LocalDateTime.now();
  }

  public ApplicationData(Parameters parameters) {
    this();
    value1 = parameters.getValue1();
    value2 = parameters.getValue2();
  }

  public String getAppName() {
    return appName;
  }

  public String getAppVersion() {
    return appVersion;
  }

  public String getSystemValue() {
    return systemValue;
  }

  public String getValue1() {
    return value1;
  }

  public String getValue2() {
    return value2;
  }

  public LocalDateTime getTime() {
    return time;
  }
}
