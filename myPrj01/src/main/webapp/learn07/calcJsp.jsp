<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
int result = 0;

// post로 전달 된 경우에만 실행
if(request.getMethod().equals("POST")) {		// post 소문자로 쓰면 적용 안됨
	
	// 연산자를 가져옴
	String oper = request.getParameter("calc");
	int front = Integer.parseInt(request.getParameter("front"));
	int back = Integer.parseInt(request.getParameter("back"));
	
	switch(oper) {
	
	 case "+" : result = front + back;
	 break;
	 
	 case "-" : result = front - back;
	 break;
	 
	 case "*" : result = front * back;
	 break;
	 
	 case "/" : result = front / back;
	 break;
	 
	 default:
		 
	}
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Calculator JSP</h2><hr>
	<form method="post" name="calculator">
		<input type="text" name="front">
		<select name="calc">
			<option>+</option>
			<option>-</option>
			<option>*</option>
			<option>/</option>
		</select>
		<input type="text" name="back">
		<input type="submit" value="=">
	</form>
	<hr>
	계산 결과: <%= result %>
</body>
</html>