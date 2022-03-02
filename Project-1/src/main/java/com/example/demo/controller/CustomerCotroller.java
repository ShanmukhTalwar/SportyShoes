package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Customer;
import com.example.demo.ShoesDetails;
import com.example.demo.service.CustomerService;
import com.example.demo.service.ShoesService;

@Controller

public class CustomerCotroller {
	
	Customer customer;
	Optional<Customer> c;
	
	@Autowired
	private CustomerService service;

	@Autowired
	private ShoesService service2;

	@RequestMapping("/signUp")
	public String home() {
		return "Adduser";
	}

	@RequestMapping(path = "SignUpAndLogin")
	public String sigUpAndLogin(@RequestParam("shoesId") int shoesId, Model model) {
		System.out.println(shoesId);
		model.addAttribute("shoesId", shoesId);
		return "SignUpAndLogin";
	}

	@RequestMapping(path = "/getCustomer", method = RequestMethod.GET)
	public String getCustomer(Model model) {
		List<Customer> customer = new ArrayList<Customer>();
		customer = service.getCustomer();
		model.addAttribute("customer", customer);
		return "getCustomer";
	}

	@RequestMapping(path = "order", method = RequestMethod.GET)
	public String getCustomer(@RequestParam("id") long id, @RequestParam("password") String password,
			@RequestParam("shoesId") int shoesId, Model model) {

		customer = this.service.check(id, password);
		if (customer.getPassword()!=null) {
			ShoesDetails s;
			s = service2.getShoesDetailsById(shoesId);
			model.addAttribute("shoesDetails", s);
			model.addAttribute("customer",customer);
			return "Payment";
		} else {
			return "SignUpAndLogin";
		}
	}

	@RequestMapping(path = "/signUpUser", method = RequestMethod.POST)
	public String addCourse(Customer customer, Model model) {
		System.out.println("courses running");
		this.service.addCustomer(customer);
		return "confirm";
	}

}
