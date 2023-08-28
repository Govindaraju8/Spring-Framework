package com.govind.spring.jdbc.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.govind.spring.jdbc.dao.UserDAO;
import com.govind.spring.jdbc.model.User;

public class HomeController {

	UserDAO userdao;

	@Autowired
	public HomeController(UserDAO userdao) {
		this.userdao = userdao;
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

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Validated User user, Model model) {
		boolean b = userdao.createUser(user);
		System.out.println("User Page Requested");
		model.addAttribute("userName", user.getusername());
		return "user";
	}

}
