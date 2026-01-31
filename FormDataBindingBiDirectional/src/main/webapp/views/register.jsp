<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bi-Directional Form Data Binding</title>
</head>
<body>
<center>
   		<h1 style=' color: red; text-align:center'> Registration Application</h1>
         <form:form method="post" modelAttribute="emp" >
            <table>
                  <tr>
                  <th> Employee ID</th>
                  <td> <form:input path="id"/></td>
                  </tr>
                  
                   <tr>
                  <th> Name</th>
                  <td> <form:input path="name"/></td>
                  </tr>
                  
                  <tr>
                  <th> City</th>
                  <td> <form:input path="city"/></td>
                  </tr>
                  
                   <tr>
                  <th> Salary</th>
                  <td> <form:input path="salary"/></td>
                  </tr>
                  
                   <tr>
                 
                  <td> <input type="submit" value="Register"></td>
                  </tr>
            
            
            </table>
         
         </form:form>
         
   </center></body>
</html>