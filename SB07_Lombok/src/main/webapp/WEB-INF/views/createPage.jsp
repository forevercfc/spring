<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="/create" method="get">
		작성자 : <input type="text" name="writer" value="${dto.writer }"> <br>
		내용 : <input type="text" name="content" value="${dto.content }"> <br> <hr>
		<input type="submit" value="전송">
	</form>

</body>
</html>