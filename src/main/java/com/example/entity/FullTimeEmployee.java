package com.example.entity;

import jakarta.persistence.Entity;

@Entity
public class FullTimeEmployee extends Employee {

    private Double salary;

    // Getters and Setters
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
