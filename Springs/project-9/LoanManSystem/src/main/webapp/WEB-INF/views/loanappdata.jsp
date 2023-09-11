<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List of Loan Applicants</title>
    <style>
        /* Add CSS styles here */
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 20px;
        }

        h1 {
            color: #333;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            background-color: #fff;
            border: 1px solid #ddd;
        }

        th, td {
            text-align: left;
            padding: 8px;
        }

        th {
            background-color: #333;
            color: #fff;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        a {
            text-decoration: none;
            padding: 5px 10px;
            background-color: #333;
            color: #fff;
            border: 1px solid #333;
            border-radius: 4px;
        }

        a:hover {
            background-color: #fff;
            color: #333;
        }
    </style>
</head>
<body>
    <h1>List of Loan Applicants</h1>
    
    <table>
        <thead>
            <tr>
                <th>LOAN_applicant ID</th>
                <th>Customer ID</th>
                <th>Application Date</th>
                <th>Loan Type ID</th>
                <th>Loan Amount</th>
                <th>EMI Range From</th>
                <th>EMI Range To</th>
                <th>Nominee Requested months</th>
                <th>CIBIL Score</th>
                <th>Status</th>
                <th>Conclusion Remarks</th>
                <th>Processed User</th>
                <th>Processed Date</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="loanapp" items="${loanapps}">
                <tr>
                <form action="updateLoanApplicant" method="POST">
                    <td>${loanapp.lnapid}</td>
                    <td>${loanapp.lnapcustid}</td>
                    <td>${loanapp.lnapapdate}</td>
                    <td>${loanapp.lnaplntyid}</td>
                    <td>${loanapp.lnapamount}</td>
                    <td>${loanapp.lnapemirangefrom}</td>
                    <td>${loanapp.lnapemirangeto}</td>
                    <td>${loanapp.lnapnomrequested}</td>
                    <td>${loanapp.lnapcibilscore}</td>
                    <td>
                        <input type="hidden" value="${loanapp.lnapid}" name="id">
                         <input type="text" name="status" value="${loanapp.lnapstatus}">
                    </td>
                    <td>${loanapp.lnapconclusionremarks}</td>
                    <td>${loanapp.lnapprocesseduser}</td>
                    <td>${loanapp.lnapprocessedDate}</td>
                    <td>
                             <button type="submit" >submit</button>
                       
                    </td>
                    </form>
                </tr>
            </c:forEach>
        </tbody>
    </table><br><br><br>
    <center>
<form action="<c:url value='/downloadExcel' />" method="GET">
    <button type="submit">Download Excel</button>
</form>    </center>
  
</body>
</html>
