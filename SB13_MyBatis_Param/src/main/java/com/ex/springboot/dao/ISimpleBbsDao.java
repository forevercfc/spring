package com.ex.springboot.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ex.springboot.dto.SimpleBbsDto;

@Mapper //인터페이스 구현을 xml로 하겠다
public interface ISimpleBbsDao {
	public List<SimpleBbsDto> listDao(); //목록을 보기위한 메서드
	public SimpleBbsDto viewDao(String id); //상세페이지보기 메소드
//	public int writeDao(String writer, String title, String content);
	public int writeDao(Map<String,String>map);
//-> 다량의 데이터를 매개변수로 받을 대 map을 활용가능

	//	public void deleteDao(String id);
	public int deleteDao(@Param("board_id") String id);
	//->param을  활용하여 매개변수의 이름을 변경할 수 있다.
	
	//글의 갯수를 세어 리턴하는 메소드 추가
	public int articleCount();
	
	
}
