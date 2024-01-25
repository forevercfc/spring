package com.ex.springboot;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //롬복이 설치가 되었을 때 자동으롷 getter, setter, toString, equals, hashcode(), 기본 생성자 함수 등등 메소드를 자동으로 생성
@AllArgsConstructor 
@NoArgsConstructor
public class BoardForm {
	
	private Integer num;
	
	@NotBlank(message="글쓴이 입력안했어!")
	@NotNull(message="글쓴이 빈칸 입력했잖아!")
	@Size(min=2, max=5, message="글쓴이는 2~5글자 사이로 입력해야해!")
	private String writer;
	
	@NotBlank(message="컨텐츠 입력안했어!")
	@NotNull
	private String content;
	
	
	
}