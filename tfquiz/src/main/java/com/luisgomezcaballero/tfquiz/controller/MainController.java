package com.luisgomezcaballero.tfquiz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/index")
	public ModelAndView index(Model model) {
		List<String> questionList = new ArrayList<>();
		questionList.add("q1");
		questionList.add("q2");
		questionList.add("q3");
		model.addAttribute("questionList", "questionList3");
		System.out.println("index: " + questionList);

		return new ModelAndView("index", "questionList", questionList);
	}

	@RequestMapping("/start")
	public String start(@ModelAttribute("questionList") ArrayList<String> questionList, Model model) {
		model.addAttribute("questionList", questionList);
		System.out.println("start: " + questionList);

		return "start";
	}

	@RequestMapping("/instructions")
	public String instructions(Model model) {
		return "instructions";
	}

}
