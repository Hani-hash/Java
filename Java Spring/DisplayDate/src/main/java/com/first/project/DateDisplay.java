package com.first.project;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DateDisplay {
	@RequestMapping("/")
	public String homePage() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String homePage2(Model first) {
		Date today = new Date();
		first.addAttribute("first", today.toString());
		return "date.jsp";
	}

	@RequestMapping("/time")
	public String homePage3(Model times) { 
//		DateTimeFormatter time = DateTimeFormatter.ofPattern(" HH:mm:ss");  
		LocalTime now = LocalTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:a");
		String x = formatter.format(now);
		System.out.println(x);
		times.addAttribute("times", x);
		return "time.jsp";	
}}
