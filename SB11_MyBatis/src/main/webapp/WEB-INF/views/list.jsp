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
	<table>
	<tr>
		<td>번호</td>
		<td>작성자</td>
		<td>제목</td>
		<td>X삭제X</td>
	</tr>
	<c:forEach items="list" var="dto">
		<tr>
			<td>${dto.id }</td>
			<td>${dto.writer }</td>
			<td>${dto.title }</td>
			<td>삭제</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>