package com.ing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ing")
public class BreachComplainceApplication {

	public static void main(String[] args) {
		
		System.out.println("Iniside Main");
		SpringApplication.run(BreachComplainceApplication.class, args);
		
	}

}
