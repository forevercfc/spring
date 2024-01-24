package com.ex.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/thymeleaf")
public class ThymeleafController {
	
	@GetMapping(value = "/ex01")
	public String thymeleafExample(Model model) {
		model.addAttribute("data", "타임리프 예제");
		return "th/thymeleafEx01"; 
//http://localhost:8082/thymeleaf/ex01 이라는 url로 요청이 오면 resources/templates/th/thymeleafEx01.html 을 보낸다.
	}
}
