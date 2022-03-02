package com.example.demo.CourseServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Customer;
import com.example.demo.dao.CustomerDao;
import com.example.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	public CustomerDao customerDao;

	@Override
	public List<Customer> getCustomer() {

		return customerDao.findAll();
	}

	@Override
	public Customer addCustomer(Customer course) {

		return this.customerDao.save(course);
	}

	@Override
	public Customer check(long id, String password) {

		return this.customerDao.findByIdAndPassword(id, password);
	}

}
