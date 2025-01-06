package com.example.controller;

import com.example.entity.Employee;
import com.example.entity.FullTimeEmployee;
import com.example.entity.PartTimeEmployee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @PostMapping("/full-time")
    public Employee createFullTimeEmployee(@RequestBody FullTimeEmployee employee) {
        return service.save(employee);
    }

    @PostMapping("/part-time")
    public Employee createPartTimeEmployee(@RequestBody PartTimeEmployee employee) {
        return service.save(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.findAll();
    }
}
