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
���� �Ⱦ������� ���������� �ʴ� ������ �̸��� ${name} �Դϴ�.

================ <br>
<c:forEach var="mylist" items="${lists}">
    ��� : ${mylist} <br>
</c:forEach>

</body>
</html>