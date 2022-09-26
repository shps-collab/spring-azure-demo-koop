package com.javatechie.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoKoopApplication extends SpringBootServletInitializer {

	
	@GetMapping("/message")
	public String message() {
		System.out.println("mango durango");
		return "Hello World Mango 777!";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoKoopApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringAzureDemoKoopApplication.class);
	}

}
