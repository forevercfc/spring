package com.ex.springboot;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
   public static String UPLOAD_DIRECTORY=System.getProperty("user.dir")+"/src/main/webapp/resources/img";
   
   @RequestMapping("/")
   public String displayUploadForm() {
      return "/fileForm";
   }
   @PostMapping("/uploadOk")
   public String uploadImage(Model model,@RequestParam("image") MultipartFile file, Object msg) throws IOException{
      JSONObject obj=new JSONObject();
      
      try {
         StringBuilder fileNames=new StringBuilder();
         // Returns a {code Path} by converting a path string => 이미지가 저장되는 경로
         Path fileNameAndPath=Paths.get(UPLOAD_DIRECTORY,file.getOriginalFilename());
         
         fileNames.append(file.getOriginalFilename());
         byte[] fileSize=file.getBytes();
         Files.write(fileNameAndPath,fileSize);
         model.addAttribute("msg",fileNameAndPath);
         
         System.out.println("파일이 저장되는 경로 : "+fileNameAndPath);
         System.out.println("fileNames에서 얻은 이미지 파일명 : "+fileNames);
         System.out.println("Model에 저장한 메세지 : "+model.getAttribute("msg"));
         System.out.println("=============================");
         obj.put("success", true);
         obj.put("업로드 결과", "성공");
         obj.put("파일 저장명", fileNameAndPath);
         obj.put("파일 용량", fileSize.length+"byte");
         model.addAttribute("fileName",fileNames);
      }catch(Exception e) {
         e.printStackTrace();
         obj.put("success", false);
         obj.put("업로드 결과", "실패");
      }
      
      return "board";
      //return obj.toJSONString();
   }
}