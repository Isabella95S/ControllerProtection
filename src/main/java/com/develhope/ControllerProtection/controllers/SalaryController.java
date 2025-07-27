package com.develhope.ControllerProtection.controllers;

import com.develhope.ControllerProtection.repositories.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class SalaryController {

    @Autowired
    private SalaryRepository salaryRepo;
}
