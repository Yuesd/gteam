package com.cqut.dao;

import java.util.List;
import java.util.Map;

import com.cqut.dao.model.Customer;
import com.cqut.dao.model.CustomerConstitute;
import com.cqut.dao.model.CustomerPosition;
import com.cqut.dao.model.CustomerRegion;
import com.cqut.dao.model.Customergive;
public interface CustomerMapper {
	void insertCustomer(Customer cus);
	List<Customer> selectAllCustomer();
	void deleteCustomer(int cusId);
	void  updateCustomer(Customer cus);
	List<CustomerRegion> selectCustomerRegion();
	List<CustomerPosition> getCustomerPosition();
	
	List<Map<Object, Object>> selectCustomergive();
	List<Map<Object, Object>> selectCustomerfb();
	List<CustomerConstitute> selectCustomerCuslevel();
	List<Customer> isId(String cusNo);
	
}
