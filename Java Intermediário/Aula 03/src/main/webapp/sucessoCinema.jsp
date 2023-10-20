<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
<h3>Cadastro de Sessões de Cinema</h3>
<fieldset class="form-control">
<legend>Dados da Sessão Cadastrada</legend>
<p>A seguinte sessão foi cadastrada com sucesso</p>
<br>
<b>Título do Filme: </b>${Sessao.titulo} <br>
<b>Data da sessão: </b>${Sessao.data } <br> 
<b>Hora de Início: </b>${Sessao.horaInicio } <br>
<b>Hora de Término: </b>${Sessao.horaTermino } <br>
<b>Sela: </b>${Sessao.sala }
</fieldset>
</div>
</body>
</html>