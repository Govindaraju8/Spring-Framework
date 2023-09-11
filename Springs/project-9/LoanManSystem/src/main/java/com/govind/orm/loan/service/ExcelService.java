package com.govind.orm.loan.service;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.govind.orm.loan.model.LoanApplicants;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

@Service
public class ExcelService {
	public Workbook generateLoanApplicantsExcel(List<LoanApplicants> loanApplicantsList) throws IOException {
        // Create a new workbook
        Workbook workbook = new XSSFWorkbook();

        // Create a sheet in the workbook
        Sheet sheet = workbook.createSheet("Loan Applicants");

        // Create a header row
        Row headerRow = sheet.createRow(0);
        String[] headers = {"ID", "Customer ID", "Application Date", "Loan Type ID", "Loan Amount",
                "EMI Range From", "EMI Range To", "Nominee Requested Amount",
                "CIBIL Score", "Status", "Conclusion Remarks", "Processed User", "Processed Date"};

        for (int i = 0; i < headers.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(headers[i]);
        }

        // Populate data rows
        int rowNum = 1;
        for (LoanApplicants loanApp : loanApplicantsList) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(loanApp.getLnapid());
            row.createCell(1).setCellValue(loanApp.getLnapcustid());
            row.createCell(2).setCellValue(loanApp.getLnapapdate().toString());
            row.createCell(3).setCellValue(loanApp.getLnaplntyid());
            row.createCell(4).setCellValue(loanApp.getLnapamount());
            row.createCell(5).setCellValue(loanApp.getLnapemirangefrom());
            row.createCell(6).setCellValue(loanApp.getLnapemirangeto());
            row.createCell(7).setCellValue(loanApp.getLnapnomrequested());     
            row.createCell(8).setCellValue(loanApp.getLnapcibilscore());
            row.createCell(9).setCellValue(loanApp.getLnapstatus());
            row.createCell(10).setCellValue(loanApp.getLnapconclusionremarks());
            row.createCell(11).setCellValue(loanApp.getLnapprocesseduser());
            row.createCell(12).setCellValue(loanApp.getLnapprocessedDate().toString());

            // ... Continue setting values for other attributes
        }

        return workbook;
    }
}
