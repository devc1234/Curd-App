package com.dev.CurdApp.controller;

import com.dev.CurdApp.model.Employe;
import com.dev.CurdApp.repo.EmployeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employes")
public class EmployeController {

    @Autowired
    private EmployeRepo employeRepo;

    @GetMapping
    public List<Employe> getAllEmployees(){
        return  employeRepo.findAll();
    }
}
