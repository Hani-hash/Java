<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Create Question</h1>
	<form:form action="/questions/new" method="POST"
		modelAttribute="AddQuestion">
		<form:errors path="question" />
		<label for="username">Question:</label>
		<form:textarea id="txtid"  rows="4" cols="15" maxlength="200" path="question" ></form:textarea>
		<label>Tag:</label>
		<input  name="new"></input>
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>