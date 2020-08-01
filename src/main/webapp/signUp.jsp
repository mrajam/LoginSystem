<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<style type="text/css">
	.loginPanel{
		height: 250px;
		width: 400px;
		background-color: cyan;
		margin: auto;
		margin-top: middle;
	
	}
	.detailsContainer{
		margin-top: 200px;
		text-align: center;
	}
	body{
	background-color: #999966;
	/* background-image : url("images/bg_4.jpg"); */
	} 
</style>
</head>
<body>
	<a href="index.jsp" style="color: red">home |</a>
	<a href="login.jsp" style="color: red">Login</a>
	<form action="call" class="loginPanel"  method="post">
		<div class="detailsContainer">
		<h1 style="text-align: center;">Register</h1>
		<span style="margin-left: 20px;">User name: <input type="text" name="uName"></span><br><br>
		<span style="margin-left: 29px;">Password: <input type="password" name="pass"></span><br><br>
		<span style="margin-left: -30px;">Confirm Password: <input type="password" name="verifyPass"></span><br><br>
		<span style="margin-left: 20px;">Mobile NO:<input type="text" name="mobNo"></span><br><br>
		<span style="margin-left: 20px;"><input type = "submit" value="Register" style="background-color: #00ff00"></span>
		</div>
	
	</form>
	
</body>
</html>