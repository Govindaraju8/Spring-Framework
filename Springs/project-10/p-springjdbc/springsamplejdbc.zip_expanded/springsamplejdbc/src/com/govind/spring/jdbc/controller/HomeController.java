package com.govind.spring.jdbc.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.govind.spring.jdbc.dao.EmployeeDAO;
import com.govind.spring.jdbc.model.Employee789;

@Controller
public class HomeController {

	EmployeeDAO employeedao;

	@Autowired
	public HomeController(EmployeeDAO employeedao) {
		this.employeedao = employeedao;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	// add employee into the database
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Validated Employee789 emp, Model model) {
		boolean b = employeedao.createEmployee(emp);
		System.out.println("User Page Requested");
		model.addAttribute("empName", emp.getEmpname());
		return "user";
	}

	// display the employees in table
	@RequestMapping(value = "/display1", method = RequestMethod.GET)
	public String view(@Validated Employee789 emp, Model model) {

		List<Employee789> al = employeedao.getAllEmployees();
		System.out.println("User Page Requested");
		model.addAttribute("employees", al);
		return "display1";
	}

	// delete input redirection
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delredirect(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);

		return "delete";
	}

	// delete code implementation
	@RequestMapping(value = "/deletemessage", method = RequestMethod.POST)
	public String delete(@RequestParam("empno") int empno, Model model) {
		Employee789 employeeToDelete = new Employee789();
		employeeToDelete.setEmpno(empno);

		boolean deletionSuccessful = employeedao.deleteEmployee(employeeToDelete);

		if (deletionSuccessful) {
			model.addAttribute("message", "Employee record deleted successfully");
		} else {
			model.addAttribute("message", "Failed to delete employee record");
		}

		return "deletemessage";
	}

	// search input redirection
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String searchredirect(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);

		return "search";
	}

	// search by empno implementation
	@RequestMapping(value = "/searchrecord", method = RequestMethod.POST)
	public String displayEmployee(@RequestParam("empno") int empno, Model model) {
		Employee789 employee = employeedao.getEmployeeByNo(empno);

		if (employee != null) {
			model.addAttribute("employee", employee);
		} else {
			model.addAttribute("message", "Employee not found");
		}

		return "searchrecord"; // Name of the JSP page to display employee details
	}
}
