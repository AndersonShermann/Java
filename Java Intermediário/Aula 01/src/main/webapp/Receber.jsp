<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Receber</title>
</head>
<body>
	<%
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
	%>
	
	<h1>Valor de n1 = <%= n1 %></h1>
	<h1>Valor de n2 = <%= n2 %></h1>
	<h1>A soma dos valor é igual a <%= n1 + n2 %></h1>	
</body>
</html>