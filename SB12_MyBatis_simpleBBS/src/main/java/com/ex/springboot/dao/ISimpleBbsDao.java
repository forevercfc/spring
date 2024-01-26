package com.ex.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ex.springboot.dto.SimpleBbsDto;

@Mapper //인터페이스 구현을 xml로 하겠다
public interface ISimpleBbsDao {
	public List<SimpleBbsDto> listDao(); //목록을 보기위한 메서드
	public SimpleBbsDto viewDao(String id); //상세페이지보기 메소드
	public int writeDao(String writer, String title, String content);
	public void deleteDao(String id);
	
}
