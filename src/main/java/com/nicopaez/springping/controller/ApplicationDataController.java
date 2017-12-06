package com.nicopaez.springping.controller;

import com.nicopaez.springping.config.Parameters;
import com.nicopaez.springping.model.ApplicationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/")
public class ApplicationDataController {

  @Autowired
  private Parameters properties;


  @RequestMapping(method = RequestMethod.GET)
  public ApplicationData index(){
    ApplicationData data = new ApplicationData(properties);
    return data;
  }
}
