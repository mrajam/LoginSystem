<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>

<style type="text/css">
	body{
		background-color: #999966;
	}
</style>
</head>

<body>
<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	response.setHeader("Pragma", "no-cache");
	response.setDateHeader("Expires", 0);
	if(request.getSession().getAttribute("uName") == null){
		response.sendRedirect("login.jsp");
	} 
%>

	

	<h1><span style="color:  #0000ff;">Hai <b ><%= request.getSession().getAttribute("uName") %></b>......
     Welcome to your customized home.</span></h1>
	<form action="remove"  method="post">
     	<button type="submit"  style="background-color: #00ff00">Logout</button>
     </form>
     
</body>
</html>