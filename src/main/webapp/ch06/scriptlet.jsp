<%@page import="java.time.LocalDateTime"%>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Date day = new Date();
	%>
	Currunt time : <%= day %>
</body>
</html>