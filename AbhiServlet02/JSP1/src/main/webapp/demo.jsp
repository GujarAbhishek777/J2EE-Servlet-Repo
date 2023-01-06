<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
  <%
  int num1=Integer.parseInt(request.getParameter("num1"));
  int num2=Integer.parseInt(request.getParameter("num2"));
  int sum=num1+num2;
  out.println(num1);
  out.println("<br>");
  out.println(num2);
  out.println("<br>");
  out.println("The sum of two numbers is : "+sum);
  %>
</body>
</html>