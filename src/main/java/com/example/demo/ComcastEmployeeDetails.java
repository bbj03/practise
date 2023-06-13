package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class ComcastEmployeeDetails implements Employee {

    @Override
    public int salaryCalc() {
        return 0;
    }

    @Override
    public void empDetails() {
        System.out.println("Printed name");
    }

    @Override
    public int empLength(String Stringlength) {
        int s = Stringlength.length();
        System.out.println(s);
        return s;
    }

}
