<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pets</title>
</head>
<body>
	<h1>Create a Dog!</h1>
	<form action ="/Pets/Dogs" method="post">
		<p>Name:<input type="text" name="name" required></p>
		<p>Breed:<input type="text" name="breed" required></p>
		<p>Weight:<input type="number" name="weight" required></p>
		<input type="submit"value="Create Dog">
	</form>
	<h1>Create a Cat!</h1>
	<form action="/Pets/Cats" method="post">
		<p>Name:<input type="text" name="name" required></p>
		<p>Breed:<input type="text" name="breed" required></p>
		<p>Weight:<input type="number" name="weight" required></p>
		<input type="submit" value="Create Cat">
	</form>
</body>
</html>