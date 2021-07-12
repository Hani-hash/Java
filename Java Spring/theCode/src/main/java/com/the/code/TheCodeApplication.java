package com.the.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
@SpringBootApplication
public class TheCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheCodeApplication.class, args);
		
	}

	@RequestMapping("")

	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/insert")
	public String check(@RequestParam(value="code") String code) {
		if (code.equals("bushido"))
		{
		return "redirect:/code";
		
		}
		else 
		{
			return "redirect:/createError";
		}}

	    @RequestMapping("/createError")
	    public String flashMessages(RedirectAttributes redirectAttributes) {
	        redirectAttributes.addFlashAttribute("error", "you must train harder!");
	        return "redirect:/";
	    }
	    @RequestMapping("/code")
	    public String display () {
	    	return "code.jsp";
	    }
	}





