package com.dadandev.app.services;

import java.util.ArrayList;

import com.dadandev.app.dto.UserDto;

public interface UserService {
  ArrayList<UserDto> getAllUser();
}