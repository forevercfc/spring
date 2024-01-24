package com.ex.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MyController {
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
		return "Lombok 사용하기 <a href='insertForm'> 입력폼으로 이동 </a> ";
	}
	
	@RequestMapping("/insertForm")
		public String insert1() {
			return "createPage";
		}
	
	@RequestMapping("/create")
	public String insert2(@ModelAttribute("dto") ContentDTO contentDTO, BindingResult result) {
		
		System.out.println(contentDTO);
		String page = "createDonePage";
		
		ContentValidator validator = new ContentValidator(); //유효성 검증객체 생성
		validator.validate(contentDTO, result);
		
		if(result.hasErrors()) {
			page = "createPage";
		}
		return page;
	}
	
	
	
}