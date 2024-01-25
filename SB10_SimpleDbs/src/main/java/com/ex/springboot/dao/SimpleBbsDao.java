package com.ex.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.ex.springboot.dto.SimpleBbsDto;

@Repository //이 클래스를 db처리를 목적으로 하는 빈으로 등록하겠다.
public class SimpleBbsDao implements ISimpleBbsDao {

	@Autowired //우리가 설정한 디비정보를 바탕으로 오라클 드라이버 로드, 디비에 접속, 오라클드라이버 로드, 디비 접속 까지 자동으로 알아서 처리
	JdbcTemplate template;
	
	@Override
	public List<SimpleBbsDto> listDao() {
		System.out.println("listDao() 호출됨");
		String query = "select * from simpleDbs order by id desc";
		List<SimpleBbsDto> dtos = template.query(query, new BeanPropertyRowMapper<SimpleBbsDto>(SimpleBbsDto.class));
		//쿼리문의 결과가 두 줄 이상 여러개가 나올 때 sql문을 처리하기 위해서는 JdbcTemplate의 query()메소드 사용
		return dtos;
	}

	@Override
	public SimpleBbsDto viewDao(String id) {
		System.out.println("viewDao() 호출됨");
		
		String query = "select * from simpleDbs where id="+id;
		SimpleBbsDto dto = template.queryForObject(query, new BeanPropertyRowMapper<SimpleBbsDto>(SimpleBbsDto.class));
		return dto;
		//쿼리문의 결과가 한줄일 때 sql문을 처리하기 위해서는 JdbcTemplate의 queryForObject()메소드 사용
	}

	@Override
	public int writeDao(String writer, String title, String content) {
		System.out.println("writeDao() 호출됨");
		
		String query = "insert into simpleDbs values(simpleDbs_seq.nextval, ?,?,?)";
		return template.update(query, writer, title, content);
		//sql문의 insert, update, delete 문은 JdbcTemplate의 update()메소드를 사용한다.
	}

	@Override
	public int delectDao(String id) {
		
		System.out.println("delectDao() 호출됨");
		String query = "delete simpleDbs where id=?";
		return template.update(query, id);
	}

}
