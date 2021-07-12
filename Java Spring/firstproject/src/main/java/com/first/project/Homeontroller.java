package com.first.project;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Homeontroller {
	@RequestMapping("/xxx")
	public String HelloWorld() {
		return "Hello people, this is great";
	}
}
