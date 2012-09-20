<%@page import="JavaPackage.ReturnTextAndHTML"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Get HTML</h1>
	HTML: <%= JavaPackage.ReturnTextAndHTML.getHTML("Return of the HTML Monster") %>
</body>
</html>