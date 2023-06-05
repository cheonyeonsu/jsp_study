<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>메인화면</h1>
<p><%=session.getAttribute("id")%>님, 환영합니다.</p>
<p>세션 id : <%=session.getId()%></p>
<form action="logout.jsp" method="post">
<input type = "submit" value = "로그아웃"/>
</form>
</body>
</html>