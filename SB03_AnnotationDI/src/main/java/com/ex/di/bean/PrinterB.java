package com.ex.di.bean;

import org.springframework.stereotype.Component;

@Component
public class PrinterB implements Printer{
   @Override
   public void print(String message) {
      System.out.println("B를 출력 : "+message);
   }
}