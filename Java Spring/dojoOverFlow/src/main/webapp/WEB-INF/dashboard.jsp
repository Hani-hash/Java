<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Question dashboard</title>
</head>
<body>
	<h1>Question Dashboard</h1>
	<table>
		<thead style="border: 1px solid black;">
			<tr>
				<th>Questions</th>
				<th>Tags</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ questions }" var="H">
				<tr>
					<td><a href="/question/${H.id}">${ H.question }</a></td>
				</tr>
		 		<c:forEach items="${ H.tags }" var="T">
					<tr>
						<td>${ T.subject }</td>
					</tr>
				</c:forEach>
			</c:forEach>

		</tbody>
	</table>
	<a href="/questions/new">Create new</a>
</body>
</html>