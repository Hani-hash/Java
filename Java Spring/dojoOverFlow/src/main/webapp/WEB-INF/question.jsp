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
	<div>
		<h1>What is the best programming language</h1>
		<label>Tag:</label>
		<c:forEach items="${ question.tags }" var="H">
			<p>${H.subject}</p>
		</c:forEach>
	</div>
	<div>
		<label>Answer:</label>
		<c:forEach items="${ question.answers }" var="H">
			<p>${H.answer}</p>
		</c:forEach>
	</div>
	<div>
	<h1>${question.id}</h1>

		<form:form action="/question/${question.id}" method="POST"
			modelAttribute="albk">
			<form:errors path="answer" />
			<label for="username">Add your answer:</label>
			<form:textarea id="txtid" rows="4" cols="15" maxlength="200"
				path="answer"></form:textarea>

			<input type="submit" value="Answer it">
		</form:form>
	</div>


</body>
</html>