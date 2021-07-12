<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/process" method="POST">
		<table>
			<tr>
				<td><label for="name">Your Name:</label></td>
				<td><input type="text" id="name" name="name"></td>	
			</tr>
			<tr>
				<td><label>Dojo Location:</label></td>
				<td>
					<select name="dojo">
						<option>San Jose </option>
						<option>Palestin</option>
						<option>Jordan</option>
					</select>
				</td>
			</tr>
			<tr>
				<td><label>Favourite Language:</label></td>
				<td>
					<select name="language">
						<option>Python </option>
						<option>Java</option>
						<option>Html</option>
					</select>
				</td>
			</tr>
		</table>
		<label>Comment(optional):</label><br>
		<textarea name="comment" ></textarea><br>
		<input type="submit" value="Button">
		

	</form>

</body>
</html>