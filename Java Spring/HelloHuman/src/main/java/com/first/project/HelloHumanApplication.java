package com.first.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	@RequestMapping("/index")
	public String hello() {
		return "hi";
	}

	@RequestMapping("")
	public String index(@RequestParam(value="name", required=false) String searchQuery) {
			if (searchQuery != null) {
			return "<h1>Hello " + searchQuery+ "</h1><p>Welcome to SpringBoot</p>";

		
	}
		return "<h1>Hello Human</h1>" + "<p>Welcome to SpringBoot</p>";
}}
