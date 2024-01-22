<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
   out.print("#03 : hello world");
%>
<br>
 나의 아이디는 ${member.id}에오. 나의 이름은 ${member.name}이에요
 <!-- 모델 객체의 값이 아닌 커맨드 객체 변수의 속성값을 이용할 수 있다. -->
 
 
</body>
</html>