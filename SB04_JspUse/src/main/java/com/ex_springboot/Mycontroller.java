package com.ex_springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //스테레오타입에 해당이 되며 컨트롤러의 용도로 사용되는 빈이다.
public class Mycontroller {
	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
	return "JSP in Gradle";
	}

	@RequestMapping("/test1")
	public String test1() {
		return "test1";
	}
	
	@RequestMapping("/test2")
	public String test2() {
		return "sub/test2";
	}
}