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
	String id = "Adam";
	String pw = "1234";
	%>
	<div>
		id <input type="type" name="id" value="<%=id%>">
	</div>
	<div>
		pw <input type="pasword" name="pw" value="<%=pw%>">
	</div>
</body>
</html>