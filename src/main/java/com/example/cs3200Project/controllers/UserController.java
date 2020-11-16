package com.example.cs3200Project.controllers;

import com.example.cs3200Project.models.User;
import com.example.cs3200Project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("api/users")
    public List<User> findAllUsers() {
        return userService.findAllUsers();
    }

    @PutMapping("api/users/user/{id}")
    public User updateUserPassword(@PathVariable("id") Integer id,
                                   @RequestBody String password) {
        return userService.updateUserPassword(id, password);
    }
}
