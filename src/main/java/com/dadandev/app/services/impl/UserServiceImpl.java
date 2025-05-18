package com.dadandev.app.services.impl;

import java.util.ArrayList;

import com.dadandev.app.dto.UserDto;
import com.dadandev.app.services.UserService;

public class UserServiceImpl implements UserService {
  @Override
  public ArrayList<UserDto> getAllUser() {
    ArrayList<UserDto> userDtos = new ArrayList<>();
    userDtos.add(new UserDto(
        "DADAN",
        "DADAN@gmail.com",
        "088223837165"));
    userDtos.add(new UserDto(
        "hendikusua",
        "DADAN@gmail.com",
        "088223837165"));

    return userDtos;
  }
}