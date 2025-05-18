package com.dadandev.app.controller;
import com.dadandev.app.utils.ResponseUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/users/all")
    public ResponseUtil index(){
        return new ResponseUtil("OK","TRUE",null);
    }
}
