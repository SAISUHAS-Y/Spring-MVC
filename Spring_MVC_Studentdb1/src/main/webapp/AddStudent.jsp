<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student</title>
</head>
<body>
	<form action="add-student" method="post">
		<input type="number" placeholder="Enter the studentId" name="studentId">
		<input type="text" placeholder="Enter the studentName" name="studentName">
		<input type="email" placeholder="Enter the studentEmail" name="studentEmail">
		<input type="number" placeholder="Enter the studentAge" name="studentAge">
		<input type="text" placeholder="Enter the studentCourse" name="studentCourse">
		<input type="submit" value="add">
	</form>
</body>
</html>