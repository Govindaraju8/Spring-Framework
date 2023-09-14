<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Details</title>
</head>
<body>
    <h1>Employee Details</h1>
    <c:if test="${employee != null}">
        <p>Employee Number: ${employee.empno}</p>
        <p>Employee Name: ${employee.empname}</p>
        <p>Job: ${employee.job}</p>
        <p>Salary: ${employee.salary}</p>
        <p>Department: ${employee.department}</p>
    </c:if>
    <c:if test="${message != null}">
        <p>${message}</p>
    </c:if>
</body>
</html>
