package com.ex.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
	@RequestMapping("/")
	public String root() throws Exception{
		return "form";
	}
	@RequestMapping("/test1")
		public String test1(HttpServletRequest httpServletRequest, Model model) {
			String id = httpServletRequest.getParameter("id");
			String name = httpServletRequest.getParameter("name");
			model.addAttribute("id", id);
			model.addAttribute("name", name);
			return "test1";
			

		}
	
	@RequestMapping("/test2")
	public String test2(@RequestParam("id")String id, @RequestParam("name")String name, Model model) {		
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		return "test2";
		

	}
	
	
	@RequestMapping("/test3")
	public String test3(Member member, Model model) {		
		return "test3";
		//매개변수와 이름이 같은 변수를 가진 커맨드 각체를 이용하면 쉽고 간편하게 많은 데이터를 받아서 추리할 수 있다. 
		//이 경우 모델과 별도로 커맨드 객체 자체도 뷰에 전달됨
		//파라미터와 일치하는 빈을 만들어서 사용할 수 있다.
		//view페이지에서 model을 사용하지 않고 member를 사용.

	}
	
	@RequestMapping("/test4/{studentId}/{name}")
	public String getStudent(@PathVariable String studentId, @PathVariable String name, Model model) {      
	    model.addAttribute("id", studentId);
	    model.addAttribute("name", name);
	    return "test4";
	}

	}
	

