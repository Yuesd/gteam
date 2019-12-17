package com.cqut.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cqut.dao.model.Contact;
import com.cqut.dao.model.Dealrecord;
import com.cqut.service.DealrecordService;

@RestController
@CrossOrigin
@RequestMapping("/dealrecord")
public class DealrecordController {
	@Autowired
	private DealrecordService crService;
	@RequestMapping("/addDealrecord")
	public Map<String, String> addDealrecord(Dealrecord cr) {
		crService.addDealrecord(cr);
		Map<String, String> map = new HashMap<>();
		map.put("result", "新增客户交易记录成功。");
		return map;
	}
	
	@RequestMapping("/getALLDealrecord")
	public List<Dealrecord> getALLDealrecord(String cusNo){
		return crService.getALLDealrecord(cusNo);
	}
	
	@RequestMapping("/delDealrecord")
	public Map<String, String> delDealrecord(int crId){
		crService.delDealrecord(crId);
		Map<String, String> map = new HashMap<>();
		map.put("result", "删除客户交易记录成功。");
		return map;
	}

}
