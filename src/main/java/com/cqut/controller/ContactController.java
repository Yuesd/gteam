package com.cqut.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cqut.dao.model.Contact;
import com.cqut.service.Contactservice;
/**
 * 
 * @author yue
 *主要为 紧急联系人模块
 */
@RestController
@CrossOrigin
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private Contactservice ctService;
	
	@RequestMapping("/addContact")
	public Map<String, String> addContact(Contact ct) {
		ctService.addContact(ct);
		Map<String, String>  map=new HashMap<>();
		map.put("result","新增联系任务成功");
		return map;
	}
	@RequestMapping("/getAllContact")
	public List<Contact> getAllContact(String cusNo){
		return ctService.getAllContact(cusNo);
	}

	@RequestMapping("/delContact")
	public Map<String, String> delContact(int ctId){
		ctService.delContact(ctId);
		Map<String, String> map = new HashMap<>();
		map.put("result", "删除社员联系人成功。");
		return map;
	}
	 
}
