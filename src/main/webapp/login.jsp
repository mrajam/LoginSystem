<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>

<style type="text/css">
	form{
		width: 400px;
		height: 200px;
		background-color: cyan;
		margin: auto;
		margin-top: 200px;
	}
	body{
	background-color: #999966;
	}
</style>

</head>
<body>
<% response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); %>
	<a href="index.jsp" style="color: red">home |</a>
	<a href="signUp.jsp" style="color: red">new User?</a>
	<form action="verify" method="post">
		<h1 style="text-align: center;">Login</h1>
		<span style="margin-left: 50px;">User name: <input type="text" name="uName"></span><br><br>
		<span style="margin-left: 58px;">Password: <input type="password" name="pass"></span><br><br>
		<span style="margin-left: 180px;"><input type="submit" value="Login" style="background-color: #00ff00; "></span>
	</form>
	
</body>
</html>