package com.recap.springrecipeapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recap.springrecipeapi.repositories.UserRepository;
import com.recap.springrecipeapi.models.User;

@RestController
@RequestMapping("/api/user")
public class UserController {
    
    @Autowired
    UserRepository userRepository;

    @SuppressWarnings("null")
    @PostMapping
    public String userCreate(@RequestBody User user){
        userRepository.save(user);
        return "User created";
    }

    @GetMapping
    public List<User> getAllUsers(){
        List<User> users = userRepository.findAll();
        return users;
    }

}
