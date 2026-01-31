<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<h1>Your Info has be recieved in the backend app and we could able to get that data</h1>
     <h1 style='color:red'>${emp.id}</h1>
     <h1 style='color:blue'>${emp.name}</h1>
     <h1 style='color:cyan'>${emp.city}</h1>
     <h1 style='color:green'>${emp.salary}</h1>
</center>

</body>
</html>