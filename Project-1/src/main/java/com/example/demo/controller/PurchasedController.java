package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.PurchasedList;
import com.example.demo.service.PurchaseService;

@Controller

public class PurchasedController {

	@Autowired
	private PurchaseService purchasedservice;

	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	@GetMapping(path = "/purchasedlist")
	public List<PurchasedList> getCourses() {
		return this.purchasedservice.getPurchaseList();
	}

	@RequestMapping(path = "/AddToPurchaseList", method = RequestMethod.GET)
	public String addCourse(PurchasedList purchaseList, Model model) {
		this.purchasedservice.addPurchasig(purchaseList);
		return "confirm";

	}

	@GetMapping("/getOrders")
	public String getPurchasedDetails(@RequestParam("brandname") String brandname, @RequestParam("date") String date,
			Model model) {
		List<PurchasedList> purchasedList = new ArrayList<PurchasedList>();
		purchasedList = this.purchasedservice.getPurchasedListByBrandNameAndDate(brandname, date);
		model.addAttribute("purchasedList", purchasedList);
		return "displayOrders";
	}
}
