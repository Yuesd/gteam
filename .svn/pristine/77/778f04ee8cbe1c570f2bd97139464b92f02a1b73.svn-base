package com.cqut.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cqut.service.Customerservice;

@RestController
@CrossOrigin
@RequestMapping("/report")
public class Customerfb {
	@Autowired
	private Customerservice cusService;
	
	@RequestMapping("/getCustomerfb")
	public Map<String, List<Object>> getCustomerfb() {
		
		Map<String, List<Object>> map = new HashMap<>();
		List<Object> xList = new ArrayList<>();
		List<Object> dList = new ArrayList<>();
		List<Map<Object, Object>> crs = cusService.getCustomerfb();
		for(Map<Object, Object> cr : crs) {
			xList.add(cr.get("cusLevel"));
			dList.add(cr.get("cusRegion"));
		}
		map.put("x", xList);
		map.put("d", dList);
		return map;
	}
	

}
