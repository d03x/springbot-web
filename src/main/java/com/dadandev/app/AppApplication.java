package com.dadandev.app;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dadandev.app.dto.UserDto;
import com.dadandev.app.services.UserService;
import com.dadandev.app.utils.ResponseUtil;

@SpringBootApplication
@RestController
public class AppApplication {

	@Autowired
	private UserService service;

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/hello")
	public ResponseUtil hello() {

		return new ResponseUtil("OK", "Berhasil", service.getAllUser());
	}
}
