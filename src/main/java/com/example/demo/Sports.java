package com.example.demo;

public class Sports {
    public void play() {
        int nofmatches = 7;
        int wins = 4;
        System.out.println("Number of total matches=" + " " + nofmatches);
        System.out.println("Number of total wins=" + " " + wins);
    }
}
class Basketball extends Sports{
    public void play(){
        int nofmatches=2;
        int wins =1;
        System.out.println("Number of basketball matches="+" "+nofmatches);
        System.out.println("Number of basketball wins="+" "+wins);
    }
}
class Football extends Sports{
    public void play(){
        int nofmatches=3;
        int wins=1;
        System.out.println("Number of football matches="+" "+nofmatches);
        System.out.println("Number of football wins="+" "+wins);
    }
}

class Rugby extends Sports {
    public void play() {
        int nofmatches = 2;
        int wins = 2;
        System.out.println("Number of Rugby matches=" + " " + nofmatches);
        System.out.println("Number of Rugby wins=" + " " + wins);
    }
}

