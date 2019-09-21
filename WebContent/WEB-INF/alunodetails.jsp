<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.alessanderleite.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="aluno" class="br.com.alessanderleite.model.Aluno"></jsp:useBean>
	
	<jsp:setProperty property="*" name="aluno"/>
	
	<%
	AlunoDAO alunoDAO = new AlunoDAO();
	int status = alunoDAO.registerAluno(aluno);
	if (status > 0) {
		out.print("You are successfully registered");
	}
	%>
</body>
</html>