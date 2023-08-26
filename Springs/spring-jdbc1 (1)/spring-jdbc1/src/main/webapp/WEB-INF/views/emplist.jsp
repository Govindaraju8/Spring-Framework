<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import='com.nkxgen.spring.jdbc.model.Employee' %>
    <%@ page import='java.util.*' %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body BGCOLOR="yellow">
       <H1>Employees List through Spring JDBC Template </H1>

      <TABLE BORDER="1">
      <TR>
      <TH>Emp No</TH>
      <TH>Name</TH>
      <TH>Job</TH>
      <TH>Salary</TH>
      <TH>Dept No</TH>
      </TR>
      <%-- <% 
      	
        List<Employee> elist=(List<Employee>)request.getAttribute("elist");
		for(Employee e:elist){
	  %>
      	<TR>
       		  <TD> <%= e.getEmpNo() %></td>
     		  <TD> <%= e.getEName() %></TD>
      		  <TD> <%= e.getJob() %></TD>
     		  <TD> <%= e.getSalary() %></TD>
     		  <TD> <%= e.getDeptNo() %></TD>
      </TR>
      <% 
      	} 
      %> --%>
     </TABLE>
     </body>
</html>