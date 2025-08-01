package com.develhope.ControllerProtection.controllers;

import com.develhope.ControllerProtection.models.Salary;
import com.develhope.ControllerProtection.models.User;
import com.develhope.ControllerProtection.repositories.SalaryRepository;
import com.develhope.ControllerProtection.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("salary")
public class SalaryController {

    @Autowired
    private SalaryRepository salaryRepo;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public Salary getSalary(@PathVariable Integer id) {
        Optional<Salary> salaryOptional = salaryRepo.findById(id);
        if (salaryOptional.isEmpty()) {
            return null;
        }else{
            return  salaryOptional.get();
        }
    }
    @GetMapping("/{id}/salaries")
    public Salary findSalariesByUser(@PathVariable("id") Integer id) {
        Optional<User> optional = userRepository.findById(id);
        if (optional.isEmpty()) {
            return null;
        }else{
            return optional.get().getSalary();
        }
    }
    @GetMapping
    public List<Salary> getAllSalaries() {
        return salaryRepo.findAll();
    }

    @PostMapping("")
    public Salary create(@RequestBody Salary salary) {

        return salaryRepo.save(salary);
    }
}
