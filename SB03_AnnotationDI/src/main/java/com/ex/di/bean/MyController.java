package com.ex.di.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// MyController 클래스를 빈으로 등록
@Controller
public class MyController {
   
   // 빈이 생성될 때 member1 변수가 참조할 객체를 자동으로 찾아옴
   @Autowired
   Member member1;
   
   @Autowired
   @Qualifier("printerB") // 유사한 객체가 여러개일 때 해당 이름으로 정확하게 지정
   Printer printer;
   
   @Autowired
   Member member2;
   
   @Autowired
   @Qualifier("printerA")
   Printer printer2;
   
   // 요청이 / 문자열로 오면 그 다음에 오는 클래스나 메소드를 연결시켜주는 어노테이션으로, 요청방식(get/post)에 상관없이 다음 라인의 root()를 실행
   @RequestMapping("/")
   public @ResponseBody String root() { // @ResponseBody는 순수하게 스트링 데이터만으로 응답할 경우 저장 
      member1.print();
      member1.setPrinter(printer);
      member1.print();
      
      // 싱글인지 확인
      if(member1==member2) {
         System.out.println("싱글임");
      }else {
         System.out.println("커플임");
      }
      
      return "Annotation 사용";
   }
}