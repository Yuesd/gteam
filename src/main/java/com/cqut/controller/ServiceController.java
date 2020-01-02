package com.cqut.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cqut.dao.model.Servicett;
import com.cqut.service.ServiceServicet;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
/***
 * 
 * @author yue
 *主要 为社区活动模块
 */
@RestController
@CrossOrigin
@RequestMapping("/service")
public class ServiceController {
	@Autowired
	private ServiceServicet serviceService;
	
	@RequestMapping("/selectAllService")
	public Map<String, Object> getAllCustomer(int page,int rows){ 
		PageHelper.startPage(page, rows);														
		List<Servicett> list =serviceService.selectAllService();
		PageInfo<Servicett> pageInfo = new PageInfo(list);
		Map<String,Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", list);
		return map;
	}
	
	@RequestMapping("/deleteService")
	public Map<String,String> deleteService(int serId) {
		serviceService.deleteService(serId);
		Map<String,String> map = new HashMap<>();
		map.put("result", "删除社区活动成功");    
		return map;
	}
	
	
	@RequestMapping("/updateService")
	public Map<String,String> updateService(Servicett ser) {
		serviceService.updateService(ser);
		Map<String,String> map = new HashMap<>();
		map.put("result", "修改社区活动成功!");    
		return map;
	}
	@RequestMapping("/insertService")
	public Map<String,String> insertService(Servicett ser) {
		serviceService.insertService(ser);
		Map<String,String> map = new HashMap<>();
		map.put("result", "申请社区活动成功!");    
		return map;
		}
}
