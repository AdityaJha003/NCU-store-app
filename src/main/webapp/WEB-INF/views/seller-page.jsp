<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Seller</title>
</head>
<body>
	<h1>Welcome Seller</h1>
	<form:form action="seller-process" method="post" modelAttribute="Product">
		<label for="Sname">Seller Name</label>
		<form:input type="text" path="Sname" />
		<br>
		<br>
		<label for="Category">Category</label>
		<form:input type="text" path="Category" />
		<br>
		<br>
		<label for="Pname">Product Name</label>
		<form:input type="text" path="Pname" />
		<br>
		<br>
		<label for="Quantity">Quantity</label>
		<form:input type="text" path="Quantity" />
		<br>
		<br>
		<label for="PDesc">Product Description</label>
		<form:input type="text" path="PDesc" />
		<br>
		<br>
		<label for="Price">Price</label>
		<form:input type="text" path="Price" />
		<br>
		<br>

		<input type="submit" value="submit" />
		<input type="reset" value="clear" />
	</form:form>

</body>
</html>