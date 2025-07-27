package com.develhope.ControllerProtection.controllers;

import com.develhope.ControllerProtection.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

//    @GetMapping
    @Autowired
    private UserRepository userRepo;

}
