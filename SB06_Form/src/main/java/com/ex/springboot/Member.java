package com.ex.springboot;

public class Member {//데이터베이스 테이블과 관련해서 얘기할 땐 DTO라 부르고 매개변수로 사용할 땐 커맨드객체라 부
	private String id;
	private String name;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
