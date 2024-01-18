package com.ex.di.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 이 컴포넌트 다음에 나오는 Member 클래스를 빈으로 등록 할래요 => @Component 어노테이션만 지정하면 클래스 이름의 첫 글자를 소문자로 변경한 클래스 이름 member를 빈의 이름으로 자동 등록
@Component
public class Member {
   // 빈이 생성될 때 name 변수의 기본값으로 "전지현"을 지정
   @Value("전지현")
   private String name;
   @Value("광퀸")
   private String nickname;
   // 빈이 생성될 때 printer 변수가 참조할 객체를 자동으로 찾아옴
   @Autowired
   // 유사한 객체가 여러 개일 때 빈의 이름으로 정확히 지정
   @Qualifier("printerA")
   private Printer printer;
   
   public Member() {
      super();
   }
   public Member(String name,String nickname,Printer printer) {
      super();
      this.name=name;
      this.nickname=nickname;
      this.printer=printer;
   }
   // 변수에 저장된 정보를 출력하는 메소드
   public void print() {
      printer.print("Hello "+name+": "+nickname);
   }
   public String getName() {
      return name;
   }
   public String getNickname() {
      return nickname;
   }
   public Printer getPrinter() {
      return printer;
   }
   public void setName(String name) {
      this.name = name;
   }
   public void setNickname(String nickname) {
      this.nickname = nickname;
   }
   public void setPrinter(Printer printer) {
      this.printer = printer;
   }
}