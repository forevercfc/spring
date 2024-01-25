package com.ex.springboot.dao;

import java.util.List;

import com.ex.springboot.dto.SimpleBbsDto;

public interface ISimpleBbsDao {
	public List<SimpleBbsDto> listDao();
	public SimpleBbsDto viewDao(String id);
	public int writeDao(String writer, String title, String content);
	public int delectDao(String id);
}
