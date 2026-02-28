<%@page import="com.jsp.spring_mvc_studentdb.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Student</title>
</head>
<body>
<% Student student=(Student) request.getAttribute("studentObject"); %>
<h1>Enter the Details to be Updated</h1>
	<form action="save-updated-student" method="post">
		<input type="number" value=<%= student.getStudentId() %>  name="studentId" readonly="readonly">
		<input type="text" value=<%= student.getStudentName() %> name="studentName">
		<input type="email" value=<%= student.getStudentEmail() %> name="studentEmail">
		<input type="number" value=<%= student.getStudentAge() %> name="studentAge">
		<input type="text" value=<%= student.getStudentCourse() %> name="studentCourse">
		<input type="submit" value="UPDATE">
	</form>
</body>
</html>