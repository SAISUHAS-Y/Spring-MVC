<%@page import="java.util.List"%>
<%@page import="com.jsp.spring_mvc_studentdb.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Student</title>
</head>
<body>

<%
	List<Student> slist=(List) request.getAttribute("studentList");
	%>
	<h1>DISPLAYING STUDENT DETAILS:-</h1>
	<table border="1" cellpadding="10" style="border-collapse: collapse;" align="start">
		<tr>
			<th>studentId</th>
			<th>studentName</th>
			<th>studentEmail</th>
			<th>studentAge</th>
			<th>studentCourse</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>

		<%
		for(Student student:slist){
		%>
		<tr>
			<td> <%= student.getStudentId() %> </td>
			<td> <%= student.getStudentName() %> </td>
			<td> <%= student.getStudentEmail() %> </td>
			<td> <%= student.getStudentAge() %> </td>
			<td> <%= student.getStudentCourse() %> </td>
			<td> <a href="find-student-by-id?studentId=<%= student.getStudentId() %>">UPDATE</a></td>
			<td> <a href="delete-student-by-id?studentId=<%= student.getStudentId() %>">DELETE</a></td>
		</tr>
		<%
		}
		%>
	</table>

</body>
</html>