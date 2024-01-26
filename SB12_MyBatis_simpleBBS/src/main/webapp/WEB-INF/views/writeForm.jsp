<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<form action="write" method="post">
		
		<tr>
			<td>작성자</td>
			<td><input type="text" name="writer"/></td>
		</tr>
		<tr>
			<td>제목</td>
			<td><input type="text" name="title"/></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><input type="text" name="content"/></td>
		</tr>
		<tr>
			<td> <a href="list">글목록보기</a> 
			<input type="submit" value="작성"/></td>
			
		</tr>
	</form>
	</table>
</body>
</html>