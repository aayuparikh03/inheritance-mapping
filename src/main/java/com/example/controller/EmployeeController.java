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

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.findAll();
    }

    @PostMapping("/fulltime")
    public Employee addFullTimeEmployee(@RequestBody FullTimeEmployee employee) {
        return employeeService.save(employee);
    }

    @PostMapping("/parttime")
    public Employee addPartTimeEmployee(@RequestBody PartTimeEmployee employee) {
        return employeeService.save(employee);
    }
}
