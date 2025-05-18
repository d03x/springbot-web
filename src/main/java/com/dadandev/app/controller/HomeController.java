package com.dadandev.app.controller;

import org.springframework.web.bind.annotation.RestController;

import com.dadandev.app.dto.UserDto;
import com.dadandev.app.services.UserService;
import com.dadandev.app.utils.ResponseUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
public class HomeController {
  @Autowired
  private UserService service;

  @ResponseStatus(HttpStatus.OK)
  @GetMapping("/")
  public ResponseUtil hello() {
    return new ResponseUtil("OK", "Success Fetch User", service.getAllUser());
  }

  @ResponseStatus(HttpStatus.OK)
  @GetMapping("/users/{id}")
  public ResponseUtil findUser(@PathVariable String id) {

    if (id == "dadan") {
      return new ResponseUtil(
          "OK",
          "User detail success",
          new UserDto(
              "dadan",
              "dadan@gmail.com",
              "08827276663"));
    }

    return new ResponseUtil("OK", "User", null);
  }

}