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
import com.cqut.service.CustomerConstituteService;

@RestController
@CrossOrigin
@RequestMapping("/report")
public class CustomerConstituteController {
	@Autowired
	private CustomerConstituteService ccs;
	@RequestMapping("/getCustomerCusLevel")
	public Map<String, List<Object>> getCustomerCuslevel(){
		Map<String, List<Object>> map = new HashMap<>();
		List<Object> Nlist=new ArrayList<>();
		List<Object> Slist=new ArrayList<>();
		List<CustomerConstitute> list = ccs.getCustomerCuslevel();
		for(CustomerConstitute js : list) {
			Map<String,Object> map1 =new HashMap<>();
			map1.put("name", js.getCusLevel());
			map1.put("value", Integer.valueOf(js.getCountNum()));
			Nlist.add(js.getCusLevel());
			Slist.add(map1);
	}
		map.put("n", Nlist);
		map.put("s", Slist);
		return map;
	}
}
