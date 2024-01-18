package com.ex.di.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //이  annotation 다음에 오는 클래스를 스프링 설정으로 사용하겠다.
public class Config {

	
	@Bean //spring이 IOC방식으로 관리하는 객체
	public  Member member1() {
		Member member1 = new Member();
		member1.setName("김영준");
		member1.setNickname("기맹즌");
		member1.setPrinter(new PrinterA());
		
		return member1;
	}
	
	@Bean(name="hello")
	//어노테이션에 이름을 지정하면 해당 클래스를 빈으로 등록할 때 입력한 이름으로 빈의 이름이 변경
	public Member member2() {
		return new Member("정지환","버블킹",new PrinterA());
	}
	@Bean
	public PrinterA printerA() {
		return new PrinterA();
	}
	@Bean
	public PrinterB printerB() {
		return new PrinterB();
	}
}
