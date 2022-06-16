<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Register Page</h2>
    <form:form action="saveUser" modelAttribute="myUser">
    
    ID<form:input path="id"/>
    Name<form:input path="name"/>
    Email<form:input path="email"/>
    
    <form:button>Register</form:button>
    
    </form:form>


</body>
</html>