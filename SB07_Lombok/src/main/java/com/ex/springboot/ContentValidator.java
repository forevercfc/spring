package com.ex.springboot;


import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ContentValidator implements Validator {

   @Override
   public boolean supports(Class<?> clazz) {
      return false;
   }
   @Override
   public void validate(Object target, Errors errors) {
      ContentDTO dto=(ContentDTO)target;
      
      String sWriter=dto.getWriter();
      if(sWriter==null || sWriter.trim().isEmpty()) { // isEmpty는 스페이스바 공백을 인식
         System.out.println("글쓴이를 입력 하세요");
         errors.rejectValue("Writer", "글쓴이 에러");
         //여기서 설정한 에러가 MyController에서 validator.validate(contentDTO, result)의 result에 값이 들어간다.
      }
      String sContent=dto.getContent();
      if(sContent==null  || sWriter.trim().isEmpty()) {
         System.out.println("내용을 입력하세요");
         errors.rejectValue("content", "컨텐츠 에러");
      }
   }
}