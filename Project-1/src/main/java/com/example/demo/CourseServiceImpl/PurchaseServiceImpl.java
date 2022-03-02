package com.example.demo.CourseServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.PurchasedList;
import com.example.demo.dao.PurchaseDao;
import com.example.demo.service.PurchaseService;

@Service
public class PurchaseServiceImpl implements PurchaseService {

	@Autowired
	public PurchaseDao purchasedao;

	@Override
	public List<PurchasedList> getPurchaseList() {

		return this.purchasedao.findAll();
	}

	@Override
	public PurchasedList getPurchase(long courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PurchasedList addPurchasig(PurchasedList p) {
		// TODO Auto-generated method stub
		return this.purchasedao.save(p);
	}

	@Override
	public List<PurchasedList> getPurchasedListByBrandNameAndDate(String brandname, String date) {
		List<PurchasedList> purchasedList;
		purchasedList=this.purchasedao.findByBrandnameAndDate(brandname, date);
		return purchasedList;
	}

}
