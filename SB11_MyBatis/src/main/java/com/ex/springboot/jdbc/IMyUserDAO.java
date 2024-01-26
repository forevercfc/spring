package com.ex.springboot.jdbc;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper  //이 이노테이션은 다음에 나오는 인터페이스 구현을 xml로 한다는 의미
public interface IMyUserDAO {
	List<MyUserDTO> list(); //테이블 유저를 셀렉하기 위한 메서드
	
}
