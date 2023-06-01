<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%! 
	static String result = "Hello,Java Server Pages";
	String getString(String data) {
		return data;
	}
	%>
	<%= getString(result) %>
</body>
</html>