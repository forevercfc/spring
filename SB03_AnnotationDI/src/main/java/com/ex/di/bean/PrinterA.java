package com.ex.di.bean;

import org.springframework.stereotype.Component;
// Component에 빈으로 등록할 이름으로  "printerA"로 등록하겠다고 추가정보 입력
@Component("printerA")
public class PrinterA implements Printer{
   @Override
   public void print(String message) {
      System.out.println("A를 출력 : "+message);
   }
}