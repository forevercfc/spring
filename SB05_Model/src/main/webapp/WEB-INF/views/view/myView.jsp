<%@ page language="java" contentType="text/html; charset=EUC-KR"%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	out.print("Model().");
%>
${lists }
<br>
${ObjectTest }
<br>
내가 싫어하지도 좋아하지도 않는 가수의 이름은 ${name} 입니다.

================ <br>
<c:forEach var="mylist" items="${lists}">
    목록 : ${mylist} <br>
</c:forEach>

</body>
</html>