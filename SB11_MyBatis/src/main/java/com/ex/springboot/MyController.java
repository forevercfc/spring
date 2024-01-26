package com.ex.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ex.springboot.jdbc.IMyUserDAO;

@Controller
public class MyController {
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
		return "MyBatis 사용하기";
	}
	
	@Autowired
	private IMyUserDAO userDao; //다형성
	
	@GetMapping("/user")
	public String userlistPage(Model model) {
		model.addAttribute("users",userDao.list());
		return "userlist";
	}
}
