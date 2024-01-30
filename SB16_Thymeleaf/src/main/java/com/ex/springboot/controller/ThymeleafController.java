package com.ex.springboot.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ex.springboot.dto.ItemDto;

@Controller
@RequestMapping
public class ThymeleafController {
   
   
   @GetMapping("/")
   public String main(Model model) {
      return "thymeleaf/main";
   }
   
   @GetMapping("/board")
   public String board(Model model) {
      return "thymeleaf/board";
   }
   
   @GetMapping("/best")
   public String bestPage(Model model) {
      ItemDto itemDto = new ItemDto();
      itemDto.setItemDetail("베스트 상품 상세 설명");
      itemDto.setItemNm("베스트 상품1");
      itemDto.setPrice(10000);
      itemDto.setRegTime(LocalDateTime.now());
      
      model.addAttribute("itmeDto", itemDto);      
      
      return "thymeleaf/best";
   }
   
   @GetMapping("/bestProducts")
   public String bestProductsPage(Model model) {
      List<ItemDto> itemDtoList = new ArrayList<>();
      
      for(int i=1; i<=10; i++) {
         ItemDto itemDto = new ItemDto();
         itemDto.setItemDetail("베스트 상품 상세 설명"+i);
         itemDto.setItemNm("베스트 상품"+i);
         itemDto.setPrice(1000*i);
         itemDto.setRegTime(LocalDateTime.now());
         
         itemDtoList.add(itemDto);
      }
      
      model.addAttribute("itemDtoList", itemDtoList);   
      return "thymeleaf/bestProducts";
   }
   
   @GetMapping("/login")
   public String login(@RequestParam(value="param1") String param1, @RequestParam(value="param2") String param2, Model model) {
	   model.addAttribute("param1", param1);
	   model.addAttribute("param2", param2);
      return "thymeleaf/login";
   }
}






