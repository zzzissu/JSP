<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
	<%
	for(int i=1; i<=100; i++){
		out.println(i);
	}
	%>
	</div>
	<h2>+=(1부터 100까지 더하기)</h2>
	<div>
	<%
	int sum=0;
	for(int i=1; i<=100; i++){
		sum += i;
	}
		out.println(sum);
	%>
	<%=sum %>
	</div>
</body>
</html>