package com.first.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}
	@RequestMapping("/")
	public String Hello() {
		return "Hello client how are you doing";
	}
	
	@RequestMapping("/Random")
	public String greeting(){
		return "Spring Boot is great! so easy to just respond with strings";
	}
}
