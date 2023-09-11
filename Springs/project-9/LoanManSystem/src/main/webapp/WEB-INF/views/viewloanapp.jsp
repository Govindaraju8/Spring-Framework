<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Loan Applicant Details</title>
    <style>
        /* Add your CSS styles here */
        .applicant {
            border: 1px solid #ccc;
            padding: 10px;
            margin: 10px;
        }

        .applicant h2 {
            margin: 0;
        }

        .applicant p {
            margin: 0;
        }

        .action-buttons {
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <h1>Loan Applicant Details</h1>
    
    <div class="applicant">
        <h2>Loan Applicant ID: ${loanapp.lnapid}</h2>
        <p>Customer ID: ${loanapp.lnapcustid}</p>
        <p>Application Date: ${loanapp.lnapapdate}</p>
        <p>Loan Type ID: ${loanapp.lnaplntyid}</p>
        <p>Loan Amount: ${loanapp.lnapamount}</p>
        <p>EMI Range From: ${loanapp.lnapemirangefrom}</p>
        <p>EMI Range To: ${loanapp.lnapemirangeto}</p>
        <p>Nominee Requested Amount: ${loanapp.lnapnomrequested}</p>
        <p>CIBIL Score: ${loanapp.lnapcibilscore}</p>
        <p>Status: ${loanapp.lnapstatus}</p>
        <p>Conclusion Remarks: ${loanapp.lnapconclusionremarks}</p>
        <p>Processed User: ${loanapp.lnapprocesseduser}</p>
        <p>Processed Date: ${loanapp.lnapprocessedDate}</p>
        
        <div class="action-buttons">
            <form action="/processLoanApplication" method="post">
                <input type="hidden" name="lnapid" value="${loanapp.lnapid}">
                <input type="hidden" name="lnapstatus" value="${loanapp.lnapstatus}">
                <button type="submit" name="action" value="REJECT">REJECT</button>
                <button type="submit" name="action" value="APPROVE">APPROVE</button>
            </form>
        </div>
    </div>
</body>
</html>
