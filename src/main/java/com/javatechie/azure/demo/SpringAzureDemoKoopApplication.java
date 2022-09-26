package com.javatechie.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoKoopApplication {

	
	@GetMapping("/message")
	public String message() {
		return "Hello World Mango 777!";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoKoopApplication.class, args);
	}

}
