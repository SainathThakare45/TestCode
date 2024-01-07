<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">	
<title>Display</title>
</head>
	<body>
	
	<%
		String name = (String)request.getAttribute("name");
		String city = (String)request.getAttribute("city");
		long mob_No = (long)request.getAttribute("mob_No");	
	%>

		<h1>Name = ${ name }</h1>
		<h1>City = <%= city %></h1>
		<h1>Mobile Number = <%= mob_No %></h1>

	</body>
</html>