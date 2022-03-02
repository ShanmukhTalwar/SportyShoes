package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "users")
public class PurchasedList {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;

	private long price;
	private String brandname;
	private String name;
	private String date;

	public PurchasedList(String brandname, long price, String name, String date) {
		super();
		this.brandname = brandname;
		this.price = price;
		this.name = name;
		this.date = date;
	}

	public PurchasedList() {
		super();
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
