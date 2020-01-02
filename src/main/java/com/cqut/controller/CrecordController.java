package com.cqut.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cqut.dao.model.Contact;
import com.cqut.dao.model.Crecord;
import com.cqut.dao.model.Customer;
import com.cqut.service.CrecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@CrossOrigin
@RequestMapping("/record")
public class CrecordController {
	@Autowired
	private CrecordService crecordService;
	
	@RequestMapping("/getAllContect")
	public Map<String, Object> getAllContect(int page,int rows){
		List<Crecord> list =crecordService.getAllContact();
		PageInfo<Crecord> pageInfo = new PageInfo(list);
		Map<String,Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", list);
		return map;
	}
	
	@RequestMapping("/getMan")
	public List<Crecord> getMan() {
		return crecordService.getMan();
	}
	@RequestMapping("/getCus")
	public List<Crecord> getCus() {
		return crecordService.getCus();
	}
	@RequestMapping("/getRecord")
	public List<Crecord> getRecord(int recordId) {
		return crecordService.getRecord(recordId);
	}
	@RequestMapping("/addMan")
	public Map<String, String> addMan(Crecord rcd) {
		crecordService.addMan(rcd);
		Map<String, String> map = new HashMap<>();
		map.put("result", "成功添加信息。");
		return map;
	}
	@RequestMapping("/addContact")
	public Map<String, String> addContact(Crecord rcd) {
		crecordService.addContact(rcd);
		Map<String, String> map = new HashMap<>();
		map.put("result", "成功添加关联信息。");
		return map;
	}
	@RequestMapping("/addRecord")
	public Map<String, String> addRecord(Crecord rcd) {
		crecordService.addRecord(rcd);
		Map<String, String> map = new HashMap<>();
		map.put("result", "成功添加交往信息。");
		return map;
	}
	
	@RequestMapping("/delContact")
	public Map<String,String> delContact(int recordId) {
		crecordService.delContact(recordId);
		Map<String,String> map = new HashMap<>();
		map.put("result", "删除关联信息成功");    
		return map;
	}
	
	@RequestMapping("/delRecord")
	public Map<String,String> delRecord(int Id) {
		crecordService.delRecord(Id);
		Map<String,String> map = new HashMap<>();
		map.put("result", "删除 信息成功");    
		return map;
	}
}
