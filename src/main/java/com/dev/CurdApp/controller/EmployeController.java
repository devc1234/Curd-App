package com.dev.CurdApp.controller;

import com.dev.CurdApp.repo.EmployeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeController {

    @Autowired
    private EmployeRepo employeRepo;

}
