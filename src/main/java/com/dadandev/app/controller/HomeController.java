package com.dadandev.app.controller;

import org.springframework.web.bind.annotation.RestController;

import com.dadandev.app.services.UserService;
import com.dadandev.app.utils.ResponseUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HomeController {
  @Autowired
  private UserService service;

  @GetMapping("/")
  public ResponseUtil hello() {
    return new ResponseUtil("OK", "Success Fetch User", service.getAllUser());
  }

  @GetMapping("/users/{id}")
  public ResponseUtil findUser(@RequestParam String id) {
    System.out.println(id);
    return new ResponseUtil("OK", "User", null);
  }

}