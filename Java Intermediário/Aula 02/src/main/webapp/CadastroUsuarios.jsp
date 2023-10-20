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
	String nome = request.getParameter("nome");
	int tel = Integer.parseInt(request.getParameter("tel"));
	String email = request.getParameter("email");
	int cpf = Integer.parseInt(request.getParameter("cpf"));
	String senha = request.getParameter("senha");
	%>
	
	<h1>Usuário cadastrado com sucesso</h1>
	<p>
	Nome:<%=nome %><br>
	Telefone:<%=tel %><br>
	Email:<%=email %><br>
	CPF: <%=cpf %><br>
	senha: <%=senha %>
	</p>
</body>
</html>