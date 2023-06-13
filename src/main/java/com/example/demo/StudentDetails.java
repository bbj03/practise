package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentDetails {

    @JsonProperty("Name")
    String name;
    @JsonProperty("Age")
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
