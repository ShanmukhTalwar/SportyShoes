package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ShoesDetails {

	@Id
	
	private int shoesId;
	private String brandName;
	private double price;
	private int stock;

	public ShoesDetails() {
		super();
	}

	public ShoesDetails(int shoesId, String brandName, double price, int stock) {
		super();
		this.shoesId = shoesId;
		this.brandName = brandName;
		this.price = price;
		this.stock = stock;
	}

	public int getShoesId() {
		return shoesId;
	}

	public void setShoesId(int shoesId) {
		this.shoesId = shoesId;
	}

	public String getBrandName() {
		return brandName;

	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
