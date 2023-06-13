package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class CtsEmployeeDetails implements Employee {
    @Override
    public int salaryCalc() {
        return 0;
    }

    @Override
    public void empDetails() {
        System.out.println("print method");
    }

    @Override
    public int empLength(String length) {
        return 0;
    }
}
