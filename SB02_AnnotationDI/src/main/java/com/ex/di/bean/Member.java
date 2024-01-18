package com.ex.di.bean;

public class Member {
   private String name;
   private String nickName;
   private Printer printer;
   
   public Member() {
      super();
   }
   public Member(String name,String nickname,Printer printer) {
      super();
      this.name=name;
      this.nickName=nickname;
      this.printer=printer;
   }
   // 변수에 저장된 정보를 출력하는 메소드
   public void print() {
      printer.print("Hello "+name+": "+nickName);
   }
   public String getName() {
      return name;
   }
   public String getNickname() {
      return nickName;
   }
   public Printer getPrinter() {
      return printer;
   }
   public void setName(String name) {
      this.name = name;
   }
   public void setNickname(String nickname) {
      this.nickName = nickname;
   }
   public void setPrinter(Printer printer) {
      this.printer = printer;
   }
}