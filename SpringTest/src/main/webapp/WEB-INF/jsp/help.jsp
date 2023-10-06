<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
    
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HElP page</title>
</head>
<body>
<%@ page import="java.util.List" %>
<h1>This is Help Page</h1>
<%

String str = (String)request.getAttribute("name");
List<String> list = (List<String>)request.getAttribute("list");
%>
<h1>WelCome <%=str%></h1>
	
	<h1>phone :- 7432659113</h1>
	<h2>Email :- kolekarinfo@gmail.com</h2>
	
	<%
	 	for(String s:list){
    %>
	 		
	 <h1><%=s %></h1>		
	 <%
	 	}
	 %>		
	
	<hr>
	
	${list}
	
	<c:forEach var="item" items="${list }">
		<h1>${item }</h1>
		<h1><c:out value="${item }"/></h1>
	</c:forEach>
	<a href="contact"> Contact Page Jsp</a>
</body>
</html>