package com.example.demo.service;

import java.util.List;

//import com.example.demo.Courses;
import com.example.demo.PurchasedList;

public interface PurchaseService {

	public List<PurchasedList> getPurchaseList();

	public PurchasedList getPurchase(long courseId);

	public PurchasedList addPurchasig(PurchasedList p);
	
	public List<PurchasedList> getPurchasedListByBrandNameAndDate(String brandname,String date); 
		
	
}
