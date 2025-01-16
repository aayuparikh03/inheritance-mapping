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
    private  EmployeeService employeeService;



    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.findAll();
    }

    @PostMapping("/full-time")
    public Employee createFullTimeEmployee(@RequestBody FullTimeEmployee fullTimeEmployee) {
        return employeeService.save(fullTimeEmployee);
    }

    @PostMapping("/part-time")
    public Employee createPartTimeEmployee(@RequestBody PartTimeEmployee partTimeEmployee) {
        return employeeService.save(partTimeEmployee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteById(id);
        return "Employee with ID " + id + " has been deleted.";
    }
}
