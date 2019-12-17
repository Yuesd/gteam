package com.cqut.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cqut.dao.model.Customergive;
import com.cqut.service.Customerservice;

@RestController
@CrossOrigin
@RequestMapping("/report")
public class Reportgive {
	@Autowired
	private Customerservice cusService;
	
	@RequestMapping("/getCustomergive")
	public Map<String, List<Object>> getCustomergive() {
		
		Map<String, List<Object>> map = new HashMap<>();
		List<Object> xList = new ArrayList<>();
		List<Object> dList = new ArrayList<>();
		List<Map<Object, Object>> crs = cusService.getCustomergive();
		for(Map<Object, Object> cr : crs) {
			xList.add(cr.get("cusName"));
			dList.add(cr.get("orderAmounta"));
		}
		map.put("x", xList);
		map.put("d", dList);
		return map;
	}

}
