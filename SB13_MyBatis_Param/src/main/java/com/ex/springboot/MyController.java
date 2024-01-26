package com.ex.springboot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ex.springboot.dao.ISimpleBbsDao;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
	@Autowired //빈이 생성될 때 dao가 참조할 객체를 자동으로 찾아온다. 인터페이스 타입의 변수로 dao객체변수를 만들었따. 매퍼를 사용하기 때문에 코드상에는 인터페이스를 구현할 클래스가 없기 때문이다.
	ISimpleBbsDao dao;
	
	@RequestMapping("/")
	public String root() {
		return "redirect:list";
	}
	@RequestMapping("/list")
	public String userlistPage(Model model) {
		System.out.println(dao.listDao());
		model.addAttribute("list", dao.listDao());
		return "list";
	}
	@RequestMapping("/view")
	public String view(HttpServletRequest request, Model model) {
		String sId = request.getParameter("id");
		System.out.println("sId : "+sId);
		model.addAttribute("dto", dao.viewDao(sId));
		System.out.println();
		return "view";
	}
	
	@RequestMapping("/writeForm")
	public String writeForm() {
		return "writeForm";
	}
	
	@RequestMapping("/write")
	public String writeDao(HttpServletRequest request, Model model) {
//		dao.writeDao(request.getParameter("writer"), request.getParameter("title"), request.getParameter("content"));
		String sName = request.getParameter("writer");
		String sTitle = request.getParameter("title");
		String sContent= request.getParameter("content");
		
		Map<String, String> map = new HashMap<>();
		map.put("item1", sName);
		map.put("item2", sTitle);
		map.put("item3", sContent);
		
		int nResult = dao.writeDao(map);
		System.out.println("write : "+nResult);

		return "redirect:list";	
}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		String sId = request.getParameter("id");
		int nResult = dao.deleteDao(sId);
		return "redirect:list";	
}
	
	
}