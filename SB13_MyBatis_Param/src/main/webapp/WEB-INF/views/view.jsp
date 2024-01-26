<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시판</h1>
	<hr>
	작성자: ${dto.writer} <br>
	제목:${dto.title} <br>
	내용:${dto.content} <br>
	<hr>
	<br>
	<a href="list">목록보기</a>
</body>
</html>