<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 class="text-center">${Header }</h1>
  <p class="text-center">${Des }</p>
  <hr>
     <h1>Data of Page Conteact.jsp</h1>
     <h1>welcome , ${user.name}</h1>
     <h1>Your Mail is = ${user.email }</h1>
     <h1>PassWord is = ${user.pass } </h1>
     <h1>Try to Sucure the PassWord</h1>
     
</body>
</html>