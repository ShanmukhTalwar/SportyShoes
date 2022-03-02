package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.PurchasedList;

public interface PurchaseDao extends JpaRepository<PurchasedList, Integer> {
	
	public List<PurchasedList> findByBrandnameAndDate(String brandname,String date);

}
