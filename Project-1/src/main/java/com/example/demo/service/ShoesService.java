package com.example.demo.service;

import java.util.List;

import com.example.demo.ShoesDetails;

public interface ShoesService {

	public List<ShoesDetails> getShoesDetails();

	public ShoesDetails add(ShoesDetails shoesDetails);

	public ShoesDetails getShoesDetailsById(int shoesId);

}
