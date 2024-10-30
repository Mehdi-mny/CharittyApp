package com.example.userms.controllers;

import com.example.userms.entities.User;
import com.example.userms.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    UserService userService;
    @GetMapping("/")
    public List<User> ListAll(){
        return userService.listAll();
    }
}
