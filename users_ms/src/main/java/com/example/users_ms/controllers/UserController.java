package com.example.users_ms.controllers;

import com.example.users_ms.entities.Users;
import com.example.users_ms.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/listUsers")
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping("/getUserById/{id}")
    public Users getUserById(@PathVariable Long id){
        return userService.findUserById(id);
    }

    @PostMapping("/creatuser")
    public Users createUser(@RequestBody Users user) {
        return userService.createUser(user);
    }
    @PutMapping("/updateUser")
    public Users updateUser(@RequestBody Users user) {
        return userService.updateUser(user);
    }
    @DeleteMapping("/deleteUser")
    public void deleteUser(@RequestParam("id") Long id) {
        userService.deleteUser(id);
    }
}
