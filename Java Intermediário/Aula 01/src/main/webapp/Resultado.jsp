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
	int v1 = Integer.parseInt(request.getParameter("n1"));
	int v2 = Integer.parseInt(request.getParameter("n2"));
	String op = request.getParameter("op");
	int r;
	
	if(op=="a"){
		r = v1 + v2;
	}else if(op=="s"){
		r = v1 - v2;
	}else if(op=="m"){
		r = v1 * v2;
	}else {
		r = v1 / v2;
	}
	
	%>
	
	<h1>Resultado</h1>
	
	<p><%=v1 %> <%=op %> <%=v2 %> = <%=r %></p>
</body>
</html>