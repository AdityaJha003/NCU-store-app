<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Buyer</title>
</head>
<body>
	<h1>Welcome Buyer</h1>
	
	
	<form:form action="buyer-process" method="post" modelAttribute="Product">

	
	<table>
		<thead>
			<tr>
				<th>Seller name</th>
				<th>Category</th>
				<th>Product Name</th>
				<th>Quantity</th>
				<th>Product Description</th>
				<th>Price</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${plist}" var="a">
				<tr>
					<td>${a.sname}</td>
					<td>${a.category}</td>
					<td>${a.pname}</td>
					<td>${a.quantity}</td>
					<td>${a.PDesc}</td>
					<td>${a.price}</td>
					<td><form:checkbox path="buylist" value="${a.pname}" ></form:checkbox></td>
				</tr>
			</c:forEach>
		</tbody>
	</table> 
		
		
		
		<input type="submit" value="proceed to checkout" />
		<input type="reset" value="clear" />
	</form:form>
	
	<%-- <label>Select Product: </label>
        <form:checkboxes items= '${viewlist}' path='buylist'></form:checkboxes>
		<br> --%>
	
</body>
</html>