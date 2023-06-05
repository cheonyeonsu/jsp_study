<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
   
   <!--Calculator calc = new Calculator  -->>
    <jsp:useBean id ="calc" class="ch07.Calculator" />
    <!-- calcForm.html에서 입력받은 값 모두를
         Calculator 클래스의 알맞는 필드에 넣어준다. -->>
    <jsp:setProperty property="*" name="calc"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
 결과 : <%=calc.calc()%>
</body>
</html>