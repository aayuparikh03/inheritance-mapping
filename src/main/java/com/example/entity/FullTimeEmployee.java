package com.example.entity;

import jakarta.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "employee_id")
public class FullTimeEmployee extends Employee {
    private double salary;

    // Getters and Setters
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
