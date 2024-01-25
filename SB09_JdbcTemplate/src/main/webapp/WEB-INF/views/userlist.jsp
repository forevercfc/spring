<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>userlist.jsp</title>
</head>
<body>
	<%
		out.println("JdbcTemplet의 활용");
	%>
	<br>
	<c:forEach var="dto" items="${users }">
		${dto.id } : ${dto.name }
	</c:forEach>
</body>
</html>