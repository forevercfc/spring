<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board</title>
</head>
<body>
    <h1>이미지 게시판</h1>
    전체경로 : ${msg} <br>
    파일명: ${fileName} <br>
    파일용량 : ${filesize} <br>

    웹 어플리케이션의 루트 실제 절대경로 : <%=application.getRealPath("/") %> <br>
    이미지 셀제 절대경로 : <%=application.getRealPath("/resources/img") %>
    
    <!-- 이미지와 동영상 구분해서 출력하기 -->
    
    <c:set var="originalfilename" value="${fileName}"/>
    <c:set var="lowerfilename" value="${fn:toLowerCase(originalfilename)}"/>
    <c:forTokens var="ext" items="${lowerfilename}" delims="." varStatus="status">
        <c:if test="${status.last}">
            <c:choose>
                <c:when test="${ext eq 'jpg' || ext eq 'png' || ext eq 'jpeg' || ext eq 'bmp'}">
                    <img src="/resources/img/${fileName}" alt="" width="200"/>
                </c:when>
                
                <c:when test="${ext eq 'mov' || ext eq 'avi' || ext eq 'mp4' || ext eq 'wmv'}">
                    <video src="/resources/img/${fileName}" controls width="200"></video>
                </c:when>
            </c:choose>          
        </c:if>
    </c:forTokens>
</body>
</html>
