<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Iterate over collection</title>
</head>
<body>
<center>
   <h1 style='color:red; text-align:center'>Display Data From An Array</h1>
   <b>List of books available</b>
   <c:forEach var="bookName" items="${books}">${bookName }</c:forEach>
</center>
</body>
</html>