package com.cqut.dao;

import java.util.List;

import com.cqut.dao.model.Contact;
import com.cqut.dao.model.CustomerConstitute;

public interface ContactMapper {
	void addContact(Contact ct);
List<Contact> selectAllContact(String cusNo);
void deleteContact(int ctId);
List<CustomerConstitute> selectCustomerCuslevel();

}

