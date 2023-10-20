<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
		<%
		int v1 = Integer.parseInt(request.getParameter("v1"));
		int v2 = Integer.parseInt(request.getParameter("v2"));
		String op = request.getParameter("op");
		int r;
		%>
		
		
	<h1 class="text-bg-secondary p-3">CALCULADORA</h1>

	<form action="Calcular.jsp" method="post" class="container">
		<div class="row">
			<div class="col-md-4 mb-3">
				<input type="number" name="v1" class="form-control"
					placeholder="Digite um número">
			</div>
			<div class="col-md-4 mb-3">
				<select name="operacao" class="form-select">
					<option value="" selected disabled>Selecione uma operação</option>
					<option value="soma">Soma</option>
					<option value="subtracao">Subtração</option>
					<option value="multiplicacao">Multiplicação</option>
					<option value="divisao">Divisão</option>
				</select>
			</div>
			<div class="col-md-4 mb-3">
				<input type="number" name="v2" class="form-control"
					placeholder="Digite um número">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<input type="submit" value="Calcular" class="btn btn-primary">
			</div>
		</div>
	</form>
	<p class="text-muted mt-3 mb-0">Resultado</p>
	<div class="text-bg-secondary p-3 text-bg-secondary">
<p><%=v1 %> <%=op %> <%=v2 %> = </p>
	</div>

</body>
</html>