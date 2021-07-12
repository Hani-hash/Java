package com.lookify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {
	
	@RequestMapping("/")
	public String renderHome() {
		return "home.jsp";
	}
	
	@RequestMapping("/dashbored")
	public String renderdashbored() {
		return "dashbored.jsp";
	}
	
	@RequestMapping("/songs/new")
	public String renderNew() {
		return "new.jsp";
	}
	
}
