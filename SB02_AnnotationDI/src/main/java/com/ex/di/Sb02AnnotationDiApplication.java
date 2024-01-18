package com.ex.di;

// 필요한 Spring 관련 import 추가
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ex.di.bean.Config;
import com.ex.di.bean.Member;
import com.ex.di.bean.Printer;


//@SpringBootApplication
public class Sb02AnnotationDiApplication {

    public static void main(String[] args) {
        // SpringApplication.run(Sb02AnnotationDiApplication.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        
        //Member bean 가져오기
        Member member1 = context.getBean("member1", Member.class);
        System.out.println("1)===========");
        member1.print();
        
        //Member타입의 bean(hello이름의 빈) 가져오기
        Member member2 = context.getBean("hello", Member.class);
        System.out.println("2)===========");
        member2.print();
        
        //Printer 빈 가져오기
        Printer printer1 = context.getBean("printerA", Printer.class);
        member1.setPrinter(printer1);
        System.out.println("3)===============");
        member1.print();
        
        Printer printer2 = context.getBean("printerB", Printer.class);
        member1.setPrinter(printer2);
        System.out.println("4)===============");
        member1.print();
        
        //싱글인지 확인
        System.out.println("====싱글톤인지 확인하기======");
        if(member1 == member2) {
        	System.out.println("mem1과 mem2는 동일객체이다");
        }else {
        	System.out.println("mem1과 mem2는 다른 객체이다");
        }
        
        //selfEx
        System.out.println("5)selfEx: B를 출력:정지환~으로 출력해보기.");
        member2.setPrinter(printer2);
        member2.print();
        
    }
}
