<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
   
   <!--Calculator calc = new Calculator  -->>
    <jsp:useBean id ="calc" class="ch07.Calculator" />
    <!-- calcForm.html���� �Է¹��� �� ��θ�
         Calculator Ŭ������ �˸´� �ʵ忡 �־��ش�. -->>
    <jsp:setProperty property="*" name="calc"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
 ��� : <%=calc.calc()%>
</body>
</html>