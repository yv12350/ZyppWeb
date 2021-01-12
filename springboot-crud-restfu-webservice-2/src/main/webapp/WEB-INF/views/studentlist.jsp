<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title> Spring Boot Example</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div>
<div class="container" style="margin:50px">
    <div class="row text-center"><strong> User Details</strong></div>
    <div class="row" style="border:1px solid green;padding:10px">
        <div class="col-md-4 text-center"><strong>Name</strong></div>
      
        <div class="col-md-4 text-center"><strong>Course</strong></div>
        <div class="col-md-4 text-center"><strong>Section</strong></div>
        
    </div>
        <c:forEach var="students" items="${students}">
            <div class="row" style="border:1px solid green;padding:10px">
            <div class="col-md-4 text-center">${students.name}</div>
                     
                 <div class="col-md-4 text-center">${students.course}</div>
                  <div class="col-md-4 text-center">${students.section}</div>
            </div>
        </c:forEach>

</div>
</div>
</body>
</html>