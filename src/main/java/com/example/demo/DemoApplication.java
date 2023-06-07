package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {



	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Animal A = new Animal();
		Bird B = new Bird();
		Cat C = new Cat();

		A.sound();
		B.sound();
		C.sound();

		Sports S= new Sports();
		S.play();
		Basketball BB = new Basketball();
		BB.play();
		Football F = new Football();
		F.play();
		Rugby R = new Rugby();
		R.play();
		System.out.println("hello bb");
	}

}

