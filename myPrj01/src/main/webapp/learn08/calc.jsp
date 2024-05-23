<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="calc" class="learn08.BeanCalc"/>
<jsp:setProperty name="calc" property="*"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>계산 결과: JSP</h2><hr>
	연산 결과: <%=calc.calc()%>
</body>
</html>