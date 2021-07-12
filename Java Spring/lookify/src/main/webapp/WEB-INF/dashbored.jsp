<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>

</head>
<body>
<div class = "container"> 
<header style= "
display: flex
flex-direction: row
alighn-items: center">
<div>
<a href = "#">Add new</a>
<a href = "#">Top Songs</a>
</div>
<div class = "search">
<form>
<input type = "text"  placeholder = ""  id = "dashboard" name = "sreachbox">
<input type = "submit" value = "Search Artist">
</form>
</div>

</header>

<table>
	<thead>
		<th>Title</th>
		<th>Rating</th>
		<th>Action</th>
	</thead>
<tbody>
	<tr>
		<td><a href = "#">shape</a></td>
			<td>5</td>
		<td> <a href = "#">Delete</a></td>
	</tr>
	<tr>
		<td><a href = "#">hhhhh</a></td>
			<td>2</td>
		<td> <a href = "#">Delete</a></td>
	</tr>
</tbody>
</table>
</div>
</body>
</html>