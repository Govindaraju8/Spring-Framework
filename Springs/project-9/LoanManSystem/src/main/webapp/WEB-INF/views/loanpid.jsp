<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Loan Applicant Details</title>
    <style>
        /* Add your CSS styles here */
    </style>
</head>
<body>
    <h1>Loan Applicant Details</h1>
    
    
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
                <th>Nominee Requested Amount</th>
                <th>CIBIL Score</th>
                <th>Status</th>
                <th>Conclusion Remarks</th>
                <th>Processed User</th>
                <th>Processed Date</th>
               
            </tr>
        </thead>
        <tbody>
            <c:forEach var="loanapp" items="${loanapps}">
                <tr>
                  <form action="viewLoanApplicant" method="get">
                    <td>${loanapp.lnapid}</td>
                    <td>${loanapp.lnapcustid}</td>
                    <td>${loanapp.lnapapdate}</td>
                    <td>${loanapp.lnaplntyid}</td>
                    <td>${loanapp.lnapamount}</td>
                    <td>${loanapp.lnapemirangefrom}</td>
                    <td>${loanapp.lnapemirangeto}</td>
                    <td>${loanapp.lnapnomrequested}</td>
                    <td>${loanapp.annualincome}</td>
                    <td>${loanapp.disposalincome}</td>
                    <td>${loanapp.lnapcibilscore}</td>
                    <td>${loanapp.lnapstatus}</td>
                    <td>${loanapp.lnapconclusionremarks}</td>
                    <td>${loanapp.lnapprocesseduser}</td>
                    <td>${loanapp.lnapprocessedDate}</td>
                    <td>
                           <button type="submit">view</button>
                    </td>
                  </form>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    
</body>
</html>
