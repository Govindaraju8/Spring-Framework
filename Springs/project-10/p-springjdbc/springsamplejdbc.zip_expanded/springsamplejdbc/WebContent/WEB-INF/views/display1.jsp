<%@ page language="java" import="java.io.*, java.util.*, com.govind.spring.jdbc.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!--  %@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %-->

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee details form</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>Emp ID</th>
            <th>Name</th>
            <th>Job Role</th>
            <th>Salary</th>
            <th>Department</th> <!-- Fix missing closing tag -->
        </tr>
        <c:forEach items="${employees}" var="empObj">
            <tr>
                <td>${empObj.empno}</td>
                <td>${empObj.empname}</td>
                <td>${empObj.job}</td>
                <td>${empObj.salary}</td>
                <td>${empObj.department}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
