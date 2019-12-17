package com.cqut.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqut.dao.ContactMapper;
import com.cqut.dao.model.Contact;

@Service
public class Contactservice {
	@Autowired
	private ContactMapper ctMapper;
	
	public void addContact(Contact ct) {
		ctMapper.addContact(ct);
	}
	public List<Contact> getAllContact(String cusNo){
		return ctMapper.selectAllContact(cusNo);
	}
	public void delContact(int ctId) {
		ctMapper.deleteContact(ctId);
	}
}
