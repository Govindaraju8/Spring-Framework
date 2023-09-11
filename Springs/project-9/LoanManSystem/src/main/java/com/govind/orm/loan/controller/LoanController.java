package com.govind.orm.loan.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.govind.orm.loan.model.LoanInputApplication;
import com.govind.orm.loan.model.User;
import com.govind.orm.loan.model.LoanApplicants;
import com.govind.orm.loan.service.ExcelService;
import com.govind.orm.loan.service.LoanService;

@Controller
public class LoanController {
	
	private LoanService loanser;
	private LoanInputApplication preobject;
	
	@Autowired
    private ExcelService excelService;
	
	@Autowired
	public LoanController(LoanService loanser)
	{
		this.loanser=loanser;
	}
	
	
	@RequestMapping(value = "/loginbutton", method = RequestMethod.POST)
	public String mainpage() {
		return "demo";
	}

	// inital login page
	  @RequestMapping(value = "/home", method = RequestMethod.GET) 
	  public String home() { 
		  return "login";
	 }
	
	/*
	 * //login page
	 * 
	 * @RequestMapping(value = "/home", method = RequestMethod.GET) public String
	 * home() { return "login"; }
	 */
	
	
	// registering the new customer
		@RequestMapping(value = "/registerbutton", method = RequestMethod.POST)
		public String register() {
			return "register";
		}

		@RequestMapping(value = "/register", method = RequestMethod.POST)
		public String registersucess(@ModelAttribute("User") User us1, Model model) {
			loanser.RegisterData(us1);
			System.out.println(us1);

			return "login";
		}

	
	
	@RequestMapping(value = "/userlogin", method = RequestMethod.POST)
	public String logindata(@ModelAttribute("User") User us, Model model) {
		if (!loanser.checkCredentials(us)) {
			return "login";
		} else {
			if (("Admin".equals(loanser.checkusertype(us)) && loanser.checkCredentials(us))) {
				List<LoanApplicants> la = loanser.listAll();
				model.addAttribute("loanapps", la);
				return "loanappdata";
			}
			model.addAttribute("userr",us);
			
			return "options";
		}
	}

	@RequestMapping(value = "/submitLoanApplication", method = RequestMethod.GET)
	public String LoanInput(@ModelAttribute("loanInputApplication") LoanInputApplication lnInput, Model model) {
		preobject = lnInput;
		model.addAttribute("loanlist", lnInput);

		return "preview";
	}
	
	@RequestMapping(value = "/editForm", method = RequestMethod.POST)
	public String submitForm(Model model) {
		System.out.println(preobject);
		model.addAttribute("loanlist", preobject);
		return "demo";
	}

	@RequestMapping(value = "/saveform", method = RequestMethod.POST)
	public String SaveForm(Model model) {
		System.out.println(preobject);

		loanser.DataInsertion(preobject);
		model.addAttribute("serviceloan", preobject);
		return "approval";
	}
	/*
	 * @RequestMapping(value = "/LoanApplicants", method = RequestMethod.GET) public
	 * String LoanInput(Model model) { List<LoanApplicants> la=loanser.listAll();
	 * model.addAttribute("loanapps",la); return "loanappdata"; }
	 */
	
	@RequestMapping(value = "/viewLoanApplicant", method = RequestMethod.POST)
	public String viewLoanApplicant(Model model) {

		List<LoanApplicants> la = loanser.listAll();
		model.addAttribute("loanapps", la);
		return "loanappdata";
	}
	
	@RequestMapping(value = "/updateLoanApplicant", method = RequestMethod.POST)
	public String updateLoanApplicant(String status,int id, Model model) {
		
		
		  loanser.laonappupdatestatus( status, id);

		List<LoanApplicants> la = loanser.listAll();
		model.addAttribute("loanapps", la);
		return "loanappdata";
	}
	
	@RequestMapping(value = "/downloadExcel", method = RequestMethod.GET)
	public void downloadExcel(HttpServletResponse response) {
	    try {
	        // Fetch Loan Applicants data
	        List<LoanApplicants> loanApps = loanser.listAll();

	        // Generate the Excel workbook using the service
	        Workbook workbook = excelService.generateLoanApplicantsExcel(loanApps);

	        // Set response headers
	        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
	        response.setHeader("Content-Disposition", "attachment; filename=loan_applicants.xlsx");

	        // Write the Excel workbook to the response
	        workbook.write(response.getOutputStream());
			workbook.close();
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	@RequestMapping(value = "/check", method = RequestMethod.GET)
	public String Checking(Model model) {

		return "Checkeligible";
	}

	@RequestMapping(value = "/viewapps", method = RequestMethod.GET)
	public String viewloanAppsforUser(@RequestParam(name = "lnapprocesseduser") int id,Model model) {

		List<LoanApplicants> loa=loanser.getuserLoans(id);
		model.addAttribute("loanapps", loa);
		return "viewuserapps";
	}
	
}
