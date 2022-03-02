package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.ShoesDetails;

public interface ShoesDao extends JpaRepository<ShoesDetails, Integer> {

	public ShoesDetails findByShoesId(int shoesId);

}