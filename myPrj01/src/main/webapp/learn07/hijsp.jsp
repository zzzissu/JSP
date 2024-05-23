<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>									<!-- 지시어 -->
<%!
String str1 = "JSP";
String str2 = "안녕하세요";			// 스크립트 요소(선언부)
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HelloJSP</title>
</head>
<body>
	<h2>처음 만들어보는 <%= str1 %></h2>		<!-- 스크립트 요소(표현식) -->
	<p>
		<%
		out.println(str2 + str1 + "입니다. 열공합시다^^*");		// 스크립트요소(스크립틀릿)
		%>
	<p>
</body>
</html>

<%-- 
	<%@ %>: 지시를 위한 코드 블록
	<%  %>: 스크립트릿(자바코드)
	<%! %>: 선언부(변수선언, 함수선언)
	<%= %>: 표현식(출력)
 --%>