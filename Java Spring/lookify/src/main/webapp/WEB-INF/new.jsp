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
<header>
<a href="">Dashboard</a>
</header>
<form:form action="#" method = ""post modelAttribute= "song" >
<div>
<form:errors path="title"></form:errors>
<form:input type="text" name = "title" path = "title"/>
</div>
<div>
<form:errors path="artist"></form:errors>
<form:input type="text" name = "artist" path = "artist"/>
</div>
<div>
<form:errors path="rating"></form:errors>
<form:input type="text" name = "rating" path = "rating"/>
</div>

</form:form>

</div>
</body>
</html>