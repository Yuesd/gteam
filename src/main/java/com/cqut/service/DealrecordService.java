package com.cqut.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqut.dao.ContactMapper;
import com.cqut.dao.DealrecordMapper;
import com.cqut.dao.model.Contact;
import com.cqut.dao.model.Dealrecord;

@Service
public class DealrecordService {
	@Autowired
	private DealrecordMapper crMapper;
	
	public void addDealrecord(Dealrecord cr) {
		crMapper.addDealrecord(cr);
	}
	public List<Dealrecord> getALLDealrecord(String cusNo){
		return crMapper.selectALLDealrecord(cusNo);
	}
	public void delDealrecord(int ctId) {
		crMapper.deleteDealrecord(ctId);
	}

}
