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
		out.print("medel: 모델은 정보를 가지고 있어요.");
	%>
	<br>
	당신의 이름은 ${name}입니다. model 을 통해 정보를 가져 옵니다.
</body>
</html>