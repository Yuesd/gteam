package com.cqut.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqut.dao.ContactMapper;
import com.cqut.dao.CustomerMapper;
import com.cqut.dao.model.CustomerConstitute;


@Service
public class CustomerConstituteService {
	@Autowired
	private CustomerMapper customerMapper;

	public List<CustomerConstitute> getCustomerCuslevel(){
		return customerMapper.selectCustomerCuslevel();
	}
}
