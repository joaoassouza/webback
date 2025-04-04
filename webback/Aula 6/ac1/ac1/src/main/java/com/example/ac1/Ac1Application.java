package com.example.ac1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Ac1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Ac1Application.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("teste");
	
	}

}
