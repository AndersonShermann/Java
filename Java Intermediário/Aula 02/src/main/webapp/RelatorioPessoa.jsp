<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadatro de usuário</title>
</head>
<body>
	<%
	String nome = request.getParameter("nome");
	String email = request.getParameter("email");
	String login = request.getParameter("login");
	String senha = request.getParameter("senha");
	%>
	
	<h1>Usuário cadastrado com sucesso</h1>
	
	<p>
	Nome: <%=nome %><br>
	Email: <%=email %><br>
	Login: <%=login %><br>
	Senha: <%=senha %>
	</p>
</body>
</html>