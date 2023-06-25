<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    
    <body>
    <center>
        <h1>Welcome to the NCU store</h1>
        <p><b>Sign up if you are new here</b></p>
        <a href="/miniapp/sign-up"><button>Sign up</button></a>
        <br><br>
        
        <form:form action="login" method="post" modelAttribute="User">
		
		<label for="Uname">UserName:</label>
		<form:input type="text" path="Uname" />
		<br>
		<br>
		<label for="Pass">Password:</label>
		<form:input type="password" path="Pass" />
		<input type="submit" value="submit" />
		<input type="reset" value="clear" />
	</center>
</form:form> 
      
    </body>
</html>
