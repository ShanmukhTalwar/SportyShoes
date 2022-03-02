package com.example.demo.CourseServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ShoesDetails;
import com.example.demo.dao.ShoesDao;
import com.example.demo.service.ShoesService;

@Service
public class ShoesServiceImpl implements ShoesService {

	@Autowired
	private ShoesDao shoesDao;

	@Override
	public List<ShoesDetails> getShoesDetails() {

		return this.shoesDao.findAll();
	}

	@Override
	public ShoesDetails add(ShoesDetails shoesDetails) {

		return shoesDao.save(shoesDetails);
	}

	@Override
	public ShoesDetails getShoesDetailsById(int shoesId) {
		ShoesDetails s = shoesDao.findByShoesId(shoesId);
		return s;
	}

}
