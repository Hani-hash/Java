package com.license.dojoOverFlow.controllers;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.license.dojoOverFlow.models.Answer;
import com.license.dojoOverFlow.models.Question;
import com.license.dojoOverFlow.service.ApiService;

@Controller
public class overFlowController {
	private final ApiService bringservice;

	public overFlowController(ApiService bringservice) {
		this.bringservice = bringservice;
	}

	@GetMapping("/")
	public String notHere() {
		return "redirect:/questions";
	}

	@GetMapping("/questions")
	public String dashboard(Model model) {
		model.addAttribute("questions", bringservice.findAllQuestions());
		model.addAttribute("tags", bringservice.findAllTag());
		return "dashboard.jsp";
	}

	@GetMapping("/questions/new")
	public String addNewQuestion(@ModelAttribute("AddQuestion") Question question) {
		return "createQuestion.jsp";
	}

	@PostMapping("/questions/new")
	public String all(@RequestParam("new") String New, @Valid @ModelAttribute("AddQuestion") Question question,
			BindingResult result) {
		if (result.hasErrors()) {
			return "createQuestion.jsp";
		} else {
			System.out.println("we are in the else");
			List<String> tag = Arrays.asList(New.split(","));

			bringservice.CheckAndSaveTag(tag, question);

			return "redirect:/questions/new";
		}
	}

	@GetMapping("/question/{id}")
	public String tagAnswers(Model model, @PathVariable("id") Long id, @ModelAttribute("albk") Answer answer) {
		model.addAttribute("question", bringservice.findById(id));
		return "question.jsp";
	}

	@PostMapping("/question/{id}")
	public String createAnswer(@Valid @ModelAttribute("albk") Answer answer, BindingResult result, Model model,
			@PathVariable("id") Long id) {
		if (result.hasErrors()) {
			model.addAttribute("questions", bringservice.findById(id));
			return "question.jsp";
		} else {
			answer.setQuest(bringservice.findById(id));
			bringservice.createNewaa(answer);
			return "redirect:/";
		}
	}
}
