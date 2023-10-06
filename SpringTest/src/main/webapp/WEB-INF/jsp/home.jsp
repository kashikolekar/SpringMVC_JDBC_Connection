<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
<%@ page import="java.util.List" %>
	<h1>THis Is Home Page </h1>
	<h1> call by home controller</h1>
	<h1>url/home</h1>
    <%
  
    String str = (String)request.getAttribute("name");
    
    List<String> frinds = (List<String>)request.getAttribute("f"); 
    %>
	
	<h1>Name is <%=str %></h1>
	<%
	 	for(String s:frinds){
    %>
	 		
	 <h1><%=s %></h1>		
	 <%
	 	}
	 %>		
	 
	
	
	<a href="about"> About Page ..</a>
</body>
</html>