<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</p>

	<form action="user" method="post">
	    <label for="empNo">Employee No:</label>
        <input type="text" name="empno" id="empNo" placeholder="Employee No" required><br><br>

        <label for="empName">Employee Name:</label>
        <input type="text" name="empname" id="empName" placeholder="Employee Name" required><br><br>

        <label for="job">Job Designation:</label>
        <input type="text" name="job" id="job" placeholder="Job Designation" required><br><br>

        <label for="salary">Salary:</label>
        <input type="text" name="salary" id="salary" placeholder="Salary" required><br><br>

        <label for="department">Department:</label>
        <input type="text" name="department" id="department" placeholder="Department" required><br><br>
		
		 <input type="submit" value="add">
	</form>
	<form action="display1" method="GET">
	<input type="submit" value="view">
	</form>
	<form action="delete" method="GET">
	<input type="submit" value="del">
	</form>
	<form action="search" method="GET">
	<input type="submit" value="search">
	</form>
</body>
</html>
