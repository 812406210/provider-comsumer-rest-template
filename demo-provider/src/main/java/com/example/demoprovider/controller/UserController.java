package com.example.demoprovider.controller;

import com.example.demoprovider.entity.User;
import com.example.demoprovider.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/getUser/{id}")
    public User getUserById(@PathVariable int id){
        return this.userRepository.getOne(id);
    }
}
