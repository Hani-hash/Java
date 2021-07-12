package com.first.project;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DojoController {
	@RequestMapping("/{insert}")
	public String Dojo(@PathVariable("insert") String insert) {
	if (insert.equals("Dojo")) {
		return "The Dojo is awesome";
	}
	else if(insert.equals("burbank-dojo")) {
		return "Burbank Dojo is located in Southern California";
	}
	else if(insert.equals("san-jose")) {
		return "SJ dojo is the headquarters";
	}
	 return "invalid";
	
}}
