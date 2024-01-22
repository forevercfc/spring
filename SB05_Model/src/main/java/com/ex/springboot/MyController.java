package com.ex.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
	return "Model & View 연습습습습습!";
	}
	
	@RequestMapping("/test1")
	public String test(Model model) {
		model.addAttribute("name","함혜진"); //test1로 요청이 오면 test1()매서드가 실행이 되고 모델을 매개변수로 받아 모델객체에 "name"이라는 키와 "한혜진"일아는 벨류값을 추가 
		return "test1";
		//리턴으로 스트링을 넘기변 뷰 리졸버가 test1.jsp를 찾아오며 이 페이지에서는 모델의 데이터를 이용하려 뷰에 데이터 출력 가능
	}
	
	
	@RequestMapping("/mv")
	public ModelAndView test2() {
		ModelAndView mv = new ModelAndView();
		
		List<String> list = new ArrayList<>();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		
		mv.addObject("lists", list);
		mv.addObject("name", "BTS");
		
		mv.addObject("ObjectTest", "좋아하는 가수를 알려주세요.");
		
		mv.setViewName("view/myView");//setViewName()메소드를 이용해서 뷰 정보를 같이 담는다.
		return mv; //객체자체를 리턴
	}
	
}
