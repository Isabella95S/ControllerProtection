package com.develhope.ControllerProtection.controllers;

import com.develhope.ControllerProtection.models.User;
import com.develhope.ControllerProtection.repositories.UserRepository;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

//    @GetMapping
    @Autowired
    private UserRepository userRepo;

    @GetMapping("/{id}")
    public User getUser(@PathVariable Integer id) {
        Optional<User> optionalUser = userRepo.findById(id);
        if (optionalUser.isEmpty()) {
            return  optionalUser.get();

        }else {
            return null;
        }
    }
    @PostMapping("")
    public User create(@RequestBody User user) {
    return userRepo.save(user);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @NotNull @RequestBody User user) {
        user.setId(id);
        userRepo.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        userRepo.deleteById(id);
    }
}
