<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
</head>
<body>
<form:form action="signup-process" method="post" modelAttribute="User">
		<label for="Fname">First Name</label>
		<form:input type="text" path="Fname" />
		<br>
		<br>
		<label for="Lname">Last Name</label>
		<form:input type="text" path="Lname" />
		<br>
		<br>
		<label for="Uname">User Name</label>
		<form:input type="text" path="Uname" />
		<br>
		<br>
		<label for="Pass">Password</label>
		<form:input type="password" path="Pass" />
		<br>
		<br>
		<label for="Email">Email</label>
		<form:input type="text" path="Email" />
		<br>
		<br>
		<label for="UType">User type</label>
		<form:select path="UType">
			<form:options items='${User.list}'/>
		</form:select>
		
		<input type="submit" value="submit" />
		<input type="reset" value="clear" />
</form:form>
</body>
</html>