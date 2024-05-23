<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="BeanTest" class="learn08.BeanTest" scope="page"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JAVA Bean</title>
</head>
<body>
	<h2>자바빈 사용하기</h2>
	<h3><%= BeanTest.getName() %></h3>
</body>
</html>