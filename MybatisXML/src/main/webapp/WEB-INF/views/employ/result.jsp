<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>
		<c:forEach var="ele" items="${list_1}">
		<tr><td>${ele.employCode}</td><td>${ele.employName}</td></tr>
		</c:forEach>
	</table>
	
	<p>Delete All : ${deleteCnt}</p>
	
	<p>Insert Records : ${insertCnt}</p>
	
	<table>
		<c:forEach var="ele" items="${list_2}">
		<tr><td>${ele.employCode}</td><td>${ele.employName}</td></tr>
		</c:forEach>
	</table>
	
	<p>처리결과 : ${msg}</p>
</body>
</html>