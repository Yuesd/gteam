package com.cqut.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqut.dao.CustomerMapper;
import com.cqut.dao.model.Customer;
import com.cqut.dao.model.CustomerConstitute;
import com.cqut.dao.model.CustomerPosition;
import com.cqut.dao.model.CustomerRegion;
import com.cqut.dao.model.Customergive;

@Service
public class Customerservice {
	@Autowired
	private CustomerMapper customerMapper;
	
	public void addCustomer(Customer cus) {
		customerMapper.insertCustomer(cus);
	}
	
	public List<Customer> getAllCustomer(){
		return customerMapper.selectAllCustomer();
	}
	public void delCustomer(int cusId) {
		customerMapper.deleteCustomer(cusId);
	}
	public void updateCustomer(Customer cus) {
		customerMapper.updateCustomer(cus);
		
	}
	public List<CustomerRegion> getCustomerRegion(){
		return customerMapper.selectCustomerRegion();
	}
	
	public List<CustomerPosition> getCustomerPosition()
	{
		return customerMapper.getCustomerPosition();
	}
	
	public List<Map<Object, Object>> getCustomergive(){
		return customerMapper.selectCustomergive();
	}

	public List<Map<Object, Object>> getCustomerfb(){
		return customerMapper.selectCustomerfb();
	}

	public List<Customer> isId(String CusNo) {
		// TODO Auto-generated method stub
		return customerMapper.isId(CusNo);
	}


}
