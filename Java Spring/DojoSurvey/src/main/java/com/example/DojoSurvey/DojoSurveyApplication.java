package com.example.DojoSurvey;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class DojoSurveyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DojoSurveyApplication.class, args);
	}

	@RequestMapping("/")
	public String index() {
		
		return "index.jsp";
	}
	@RequestMapping("result")
	public String something() {
		return "result.jsp";
	}
	@RequestMapping("java")
	public String java() {
		
		return "java.jsp";
	}
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String process(HttpSession session,@RequestParam(value="name") String name,@RequestParam(value="dojo") String dojo,@RequestParam(value="language") String language,@RequestParam(value="comment") String comment) {
		session.setAttribute("name",name);
		session.setAttribute("dojo",dojo);
		session.setAttribute("language",language);
		session.setAttribute("comment",comment);
		if(session.getAttribute("language").equals("java")) {
			return "redirect:java";
		}
		return "redirect:/result";
	}
	
	
	
	
	
	
	
}
