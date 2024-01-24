package com.ex.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ex.springboot.ContentDTO;
import com.ex.springboot.PersonForm;

import jakarta.validation.Valid;

@Controller
public class WebController implements WebMvcConfigurer{
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/results").setViewName("results");
		//요청으로 /results이 오면 result.html 뷰페이지로 이동한다.
		registry.addViewController("/board").setViewName("board");
	}
	
	
	@GetMapping("/")
	public String showForm(PersonForm personForm){
		return "form";
	}
	
	
	@PostMapping("/")
	public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "form";
		}
		return "redirect:/results";  //redirect:는 해당 페이지로 보내는 것이 아니라 /results로 요청을 다시 보낸다.
	}
	
	
	@GetMapping("/board")
	public String showBoard(ContentDTO contentDTO){
		return "board";
	}
	
	
	@PostMapping("/")
	public String checkBoard(@Valid ContentDTO contentDTO, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "board";
		}
		return "redirect:/board";  //redirect:는 해당 페이지로 보내는 것이 아니라 /results로 요청을 다시 보낸다.
	}
	
	
}
