package com.ex.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // @SpringBootApplicatio의 역할 => @Configuration, @EnableAutoConfiguration, @ComponentScan
// @Configuration : 빈을 생성할 때 싱글톤으로 한 번만 생성하며 각종 설정 세팅
// @EnableAutoConfiguration : 스프링 어플리케이션 컨텍스트를 만들 때 자동으로 설정하는 기능을 킴
// @ComponentScan : 지정한 위치 이하에 있는 컴포넌트와 @Configuration이 붙은 클래스를 스캔해서 빈으로 등록
public class Sb03AnnotationDiApplication {

   public static void main(String[] args) {
      SpringApplication.run(Sb03AnnotationDiApplication.class, args);
   }

}