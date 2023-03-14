<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.*" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<%
ArrayList<String> arr1=(ArrayList<String>) session.getAttribute("arr");
for(String book:arr1){
	%>
	<table class="table table-hover-primary">
	<tr>
	<td>
	<%out.print(book); %>
	</td>
	<td>
	
	</td>
	
	</tr>
	</table>
	<%
}
%>
</body>
</html>