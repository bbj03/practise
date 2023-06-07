package com.example.demo;

public class Animal {
    public void sound(){
        System.out.println("Animal sound");
    }
}
//Child classes inherit parent attributes but overrides the function based on what object is called
class Bird extends Animal {
    public void sound(){
        System.out.println("Chirp chirp !!");
    }
}

class Cat extends Animal {
    public void sound(){
        System.out.println("Meow Meow !!");
    }
}
