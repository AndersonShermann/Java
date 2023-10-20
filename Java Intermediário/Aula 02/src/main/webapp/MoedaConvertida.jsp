<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Moeda Convertida</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<%
	String dolar = request.getParameter("dolar");
	String euro = request.getParameter("euro");
	String peso = request.getParameter("peso");
	String libra = request.getParameter("libra");
	%>
	
	<h1>Valores Convertidos</h1>
	
	<p>
	Dolar: <%=String.format("%.2f", Double.parseDouble(dolar)) %><br>
	Euro: <%=String.format("%.2f", Double.parseDouble(euro)) %><br>
	Peso: <%=String.format("%.2f", Double.parseDouble(peso)) %><br>
	Libra: <%=String.format("%.2f", Double.parseDouble(libra)) %>
	</p>
</body>
</html>