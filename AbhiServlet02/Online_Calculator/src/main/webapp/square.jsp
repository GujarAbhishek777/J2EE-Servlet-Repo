<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
  <%
  int ans=(int)session.getAttribute("sum");
  int sq=ans*ans;
  
  out.println("square is "+sq);
  %>
</body>
</html>