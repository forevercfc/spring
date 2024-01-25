package com.ex.springboot.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@Autowired
	private MyUserDAO userDao;
	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
		return "JdbcTemplet 활용하기";
	}
	
	@GetMapping("/user")
	public String userlistPage(Model model) {
		model.addAttribute("users",userDao.list());
		//userDao객체의 list()를 호출해서 리스트 타입의 데이터를 model
		return "userlist";
	}
	
}
