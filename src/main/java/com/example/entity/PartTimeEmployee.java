package com.example.entity;

import com.example.entity.Employee;
import jakarta.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "employee_id")
public class PartTimeEmployee extends Employee {
    private double hourlyRate;

    // Getters and Setters
    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
