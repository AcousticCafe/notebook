package com.j.notebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("ownerName", "정재희 노트");
		model.addAttribute("welcomeMSG", "지금 당신의 기분은?");
		return "welcome";
	}
}