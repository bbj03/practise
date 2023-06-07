package com.example.demo;

public class Animal {
    public void sound(){
        System.out.println("Animal sound");
        System.out.println("testing");
    }
}
//Child classes inherit parent attributes but overrides the function based on what object is called
class Bird extends Animal {
    public void sound(){
        System.out.println("Chirp chirp !!");
        System.out.println("testing subbranch");
    }
}

class Cat extends Animal {
    public void sound(){
        System.out.println("Meow Meow !!");
    }
}
