<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Formul�rio de Registro de Aluno</h1>
	<form action="alunodetails.jsp" method="post">
		<table style="with: 50%">
			<tr>
				<td>Nome</td>
				<td><input type="text" name="nome" /></td>
			</tr>
			<tr>
				<td>Institui��o</td>
				<td><input type="text" name="instituicao" /></td>
			</tr>
		</table>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>