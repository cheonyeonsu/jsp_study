<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="forward_action.jsp">
		forward action : <input type = "text" name = "username">
		<input type = "submit" value ="confirm">
	</form>
	<form method="post" action="response_sendRedirect.jsp">
		response.sendRedirect : <input type = "text" name = "username">
		<input type = "submit" value ="confirm">
	</form>
</body>
</html>