<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>����ȭ��</h1>
<p><%=session.getAttribute("id")%>��, ȯ���մϴ�.</p>
<p>���� id : <%=session.getId()%></p>
<form action="logout.jsp" method="post">
<input type = "submit" value = "�α׾ƿ�"/>
</form>
</body>
</html>