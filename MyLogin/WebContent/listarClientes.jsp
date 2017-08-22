<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Clientes</title>
</head>
<body>
<h1>Lista de Clientes</h1>
<br>
<c:choose>
<c:when test="${not empty listaClientes }">
	<table>
		<tr>
			<th>Id</th>
			<th>Nome</th>
			<th>Cpf</th>
			<th>Email</th>
		</tr>
		<c:forEach var="cliente" items="${listaClientes }">
		<tr>
			<td>${cliente.id}</td>
			<td>${cliente.nome}</td>
			<td>${cliente.cpf}</td>
			<td>${cliente.email}</td>
		</tr>
		</c:forEach>
	</table>

</c:when>
<c:otherwise>
Não tem ninguem!!!
</c:otherwise>
</c:choose>
</body>
</html>