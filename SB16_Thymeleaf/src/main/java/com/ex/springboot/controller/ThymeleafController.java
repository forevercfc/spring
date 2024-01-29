package com.ex.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/thymeleaf")
public class ThymeleafController {
	@GetMapping("/main")
	public String main() {
		return "thymeleaf/main";
	}
	@GetMapping("/board")
	public String board() {
		return "thymeleaf/board";
	}
	
}
