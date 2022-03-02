package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.ShoesDetails;
import com.example.demo.service.ShoesService;

@Controller
public class ShoesDetailsDispalyController {

	private String userName = "shanmukh";
	private String password = "123";

	@Autowired
	private ShoesService shoesService;

	@RequestMapping(path = "/shoesdetails", method = RequestMethod.GET)
	public String showDetails(Model model) {
		List<ShoesDetails> shoesDetails = new ArrayList<ShoesDetails>();
		shoesDetails = shoesService.getShoesDetails();
		model.addAttribute("shoesDetails", shoesDetails);
		return "ShoesDetails";
	}

	@RequestMapping(path = "addshoes", method = RequestMethod.POST)
	public String addShoesDetails(ShoesDetails shoesDetails, Model model) {
		this.shoesService.add(shoesDetails);
		
		return "confirm";
	}

	public ShoesDetails getShoesDetailsById(int shoesId) {
		return this.shoesService.getShoesDetailsById(shoesId);
	}

	@RequestMapping(path = "/AdminLogin", method = RequestMethod.POST)
	public String adminLogin() {
		return "AdminLoginForm";
	}

	@RequestMapping(path = "/CredentialsProcess", method = RequestMethod.POST)

	public String credentialsProcess(@RequestParam("adminUserNAme") String adminUserNAme,
			@RequestParam("adminPassword") String adminPassword) {

		if (adminPassword.equalsIgnoreCase(this.password) && adminUserNAme.equalsIgnoreCase(this.userName)) {
			System.out.println("verify");
			return "confirmAdmin";
		}
		return "error";
	}
}
