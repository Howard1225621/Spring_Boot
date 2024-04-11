package com.cloudtech.spring_firstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringFirstappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFirstappApplication.class, args);
	}

	@GetMapping
	public String indexString(){
		return "Hello World";
	}

	@GetMapping("/name")
	public String getName(){
		return "Howard";
	}

	@GetMapping("/gender")
	public String gerGender(){
		return "male";
	}
}
