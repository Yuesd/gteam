package com.cqut.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cqut.dao.model.CustomerPosition;
import com.cqut.dao.model.CustomerRegion;
import com.cqut.service.Customerservice;

@RestController
@CrossOrigin
@RequestMapping("/report")
public class ReportController {
	@Autowired
	private Customerservice cusService;
	
	@RequestMapping("/getCustomerRegion")
	public Map<String, List<Object>> getCustomerRegion() {
		//{'x':['西北','东北'],'d':[5,3]}
		Map<String, List<Object>> map = new HashMap<>();
		List<Object> xList = new ArrayList<>();
		List<Object> dList = new ArrayList<>();
		List<CustomerRegion> crs = cusService.getCustomerRegion();
		for(CustomerRegion cr : crs) {
			xList.add(cr.getCusRegion());
			dList.add(cr.getCusCount());
		}
		map.put("x", xList);
		map.put("d", dList);
		return map;
	}
	
	@RequestMapping("/getCustomerPosition")
	public List<Map<Object,Object>> getCustomerPosition() 
	{
		List<Map<Object,Object>> ret = new ArrayList<>();
		List<CustomerRegion> data = cusService.getCustomerRegion();
		for(CustomerRegion obj:data) 
		{
			Map<Object, Object> map = new HashMap<>();
			Object name = new Object();
			Object value = new Object();
			name = obj.getCusRegion();
			value = obj.getCusCount();
			map.put("name",name);
			map.put("value", value);
			ret.add(map);
		}
		return ret;
	}
	
	@RequestMapping("/getCustomerctt")
	public Map<String, List<Object>> getCustomerctt() 
	{
		Map<String, List<Object>> map = new HashMap<>();
		List<Object> xList = new ArrayList<>();
		List<Object> dList = new ArrayList<>();
		List<CustomerPosition> dat = cusService.getCustomerPosition();
		for(CustomerPosition cr : dat) {
			xList.add(cr.getCusLevel());
			dList.add(cr.getNum());
		}
		map.put("L", xList);
		map.put("Y", dList);
		return map;
		
//		List<Map<Object,Object>> ret = new ArrayList<>();
//		List<CustomerPosition> dat = cusService.getCustomerPosition();
//		for(CustomerPosition obj:dat) 
//		{
//			Map<Object, Object> map = new HashMap<>();
//			Object name = new Object();
//			Object value = new Object();
//			name = obj.getCusLevel();
//			value = obj.getNum();
//			map.put("name",name);
//			map.put("value", value);
//			ret.add(map);
//		}
	}
	

}
