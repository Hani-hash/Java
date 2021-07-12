package com.counter.s;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class counter {
	int count = 0 ;
	@RequestMapping("/your_server")
	public String Counter(Model model, HttpSession session) {
		this.count++;
		session.setAttribute("count", count);
		return"welcome.jsp";
		
	}
	@RequestMapping("/your_server/counter")
	public String Count(Model model, HttpSession session) {
		if (session.getAttribute("count") !=null) {
			model.addAttribute("count", session.getAttribute("count"));
			return "counter.jsp";
		}
		else {
		model.addAttribute("count",0);
		return "counter.jsp";
		}

	
		
	
	
	
	
}}
