<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
html, body {
	height: 100%; 
	margin: 0%;
}

form {
	height: 100%;
	 display: flex;
	align-items: center;
}

div {
	width: 300px;
	margin: 0 auto;
}

label {
width : 70px;
display : inline-block;
}

h1{
font-size : 20px;
}
</style>

<!-- jquery -->
<script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
</head>
<body>
<%
Cookie[] c = request.getCookies();
if(c !=null){ //��Ű�� �����ϸ�
	for(Cookie cf : c) {
		if(cf.getName().equals("loginChk")&& cf.getValue().equals("Y")){
			%> 
			<script>
			$(function(){
				$("#loginChk").prop("checked", true);
			});
			</script>
			<%
		} else {
			%>
			<script>
			$(function(){
				$("#loginChk").prop("checked", false); //üũ ���� 
			});
			</script>
			<%
			
		}
	}
	
}

%>
	<form action="login.jsp" method="post">
		<div>
			<h1>�����ý��� �α���</h1>
			<label for="id">���̵�</label>
			<input type="text" name=id id="id" />
			<br /> 
			<label for="pw">��й�ȣ</label>
			<input type="password" name="pw" id="pw" />
			<br />
			<input type="checkbox" name=LoginChk id="LoginChk" /> ���̵� ��� <br />
			<input type="submit" value="�α���" /> <input type="reset" value="���" />

		</div>

	</form>
</body>
</html>