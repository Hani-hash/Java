package com.first.project;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class CodingController {
	@RequestMapping("/coding")
	public String index() {
		return "Hello Coding Dojo!";
	}
	@RequestMapping("/python")
	public String python() {
		return "Python/Django was awesome!";
	}
	@RequestMapping("/java")
	public String java() {
		return "Java/Spring is better!";
	}
	
	
}
