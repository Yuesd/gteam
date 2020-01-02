package com.cqut.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cqut.dao.model.CustomerConstitute;
import com.cqut.dao.model.CustomerPosition;
import com.cqut.dao.model.CustomerRegion;
import com.cqut.service.CustomerConstituteService;
import com.cqut.service.Customerservice;
/**
 * 
 * @author yue
 主要为 统计模块
 */
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
	public List<Map<Object,Object>> getCustomerPosition() {
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
	@Autowired
	private CustomerConstituteService ccs;
	@RequestMapping("/getCustomerCusLevel")
	public List<Map<Object,Object>> getCustomerCuslevel(){
		List<Map<Object,Object>> ret1= new ArrayList<>();
		List<CustomerConstitute> list = ccs.getCustomerCuslevel();
		for(CustomerConstitute js : list) {
			Map<Object, Object> map = new HashMap<>();
			Object name = new Object();
			Object value = new Object();
			name = js.getCusLevel();
			value = js.getCountNum();
			map.put("name",name);
			map.put("value", value);
			ret1.add(map);
	}
		return ret1;
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
	}
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
	@RequestMapping("/getCustomerfb")
	public Map<String, List<Object>> getCustomerfb() {
		
		Map<String, List<Object>> map = new HashMap<>();
		List<Object> xList = new ArrayList<>();
		List<Object> dList = new ArrayList<>();
		List<Map<Object, Object>> crs = cusService.getCustomerfb();
		for(Map<Object, Object> cr : crs) {
			xList.add(cr.get("cusLevel"));
			dList.add(cr.get("cusCount"));
		}
		map.put("x", xList);
		map.put("d", dList);
		return map;
	}
}
