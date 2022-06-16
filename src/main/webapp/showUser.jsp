<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="2px">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="user" items="${users}">
			<tr>
				<td>${user.getId()}</td>
				<td>${user.getName()}</td>
				<td>${user.getEmail()}</td>
				<td><a href="editUser?id=${user.getId()}">Edit</a></td>
				<td><a href="deleteUser?id=${user.getId()}">Delete</a></td>
				
			</tr>
		</c:forEach>
	</table>

</body>
</html>