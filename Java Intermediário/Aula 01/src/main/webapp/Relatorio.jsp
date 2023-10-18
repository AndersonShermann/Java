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
	String descricao = request.getParameter("descricao");
	float valor = Float.parseFloat(request.getParameter("valor"));
	int estoque = Integer.parseInt(request.getParameter("estoque"));
	String tipo = request.getParameter("tipo");	
	%>
	
	<h1>Cadastro de Produto</h1>
	
	<p>O seguinte produto foi cadastrado com sucesso: <br></p>
	
	<p>
	Nome: <%=descricao %><br>
	Valor: <%=valor %><br>
	Estoque: <%=estoque %><br>
	Tipo: <%=tipo %>
	</p>
</body>
</html>