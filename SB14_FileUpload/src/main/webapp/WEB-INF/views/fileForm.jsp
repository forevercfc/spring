<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/uploadOk" method="post" enctype="multipart/form-data">
		파일 : <input type="file" name="image"/><br>
		<input type="submit" value="파일업로드">
	</form>
</body>
</html>