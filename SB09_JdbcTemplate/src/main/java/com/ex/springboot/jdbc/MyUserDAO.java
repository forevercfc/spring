package com.ex.springboot.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MyUserDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<MyUserDTO> list(){
		String query = "select * from myUser_16th";
		 List<MyUserDTO> list = jdbcTemplate.query(query, new BeanPropertyRowMapper<MyUserDTO>(MyUserDTO.class));
		//jdbcTemplate의 query()를 이용해서 쿼리문을 실행하고 sql 쿼리 결과를 rs의 row마다 DTO객체로 받아서 전체를 리스트 데이터로 만둔다.
		
		for(MyUserDTO my : list) {
			System.out.println(my);
		}
		
		return list;
		
	}
}
