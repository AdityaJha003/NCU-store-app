<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Check Out Items</title>
</head>
<body>

<h1>thank you for shopping</h1>
<h4>Summary of all the items purchased: </h4>
<table>
		<thead>
			<tr>
				<th>Product Name</th>
				<th>Category</th>
				<th>Price</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${printlist}" var="a">
				<tr>
					<td>${a.pname}</td>
					<td>${a.category}</td>
					<td>${a.price}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table> 
	<a href="/miniapp/"><button>Home</button></a>
</body>
</html>