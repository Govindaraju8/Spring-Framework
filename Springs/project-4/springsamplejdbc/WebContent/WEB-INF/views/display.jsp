<!--%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html-->

<%@ page language="java" import="java.io.*, java.util.*, com.govind.spring.jdbc.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
            <th>department
        </tr>
        <%
            List<Employee789> elist = (List<Employee789>) request.getAttribute("data");
            for (Employee789 empObj : elist) {
        %>
        <tr>
            <td><%= empObj.getEmpNo() %></td>
            <td><%= empObj.getEmpName() %></td>
            <td><%= empObj.getJob() %></td>
            <td><%= empObj.getSalary() %></td>
             <td><%= empObj.getDepartment() %></td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>