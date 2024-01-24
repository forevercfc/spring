package com.ex.springboot;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PersonForm {
	 @NotNull //입력이 안되면 유효성 검사 통과 못함
	 @NotBlank //스페이스바 공백이 있으면 검증 통과 못함
	 @Size(min=2, max=5, message = "이름은 2~5자리로 입력하시오") //최소와 최대 길이 설정
	private String name;
	 
	 @NotNull
	 @Min(18)
	private Integer age;
	 
	 @NotNull
	 @NotBlank
	private String gender;
	 
	 @NotNull
	 @NotBlank
	 @Email(message="이메일 형식이 아닙니다.")
	private String email;
}
