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

@RestController
@CrossOrigin
@RequestMapping("/service")
public class ServiceController {

	@Autowired
	private ServiceServicet serviceService;
	
	
	@RequestMapping("/selectAllService")
	public Map<String, Object> getAllCustomer(int page,int rows){//page , rows是easyui的datagrid提交的参数
		PageHelper.startPage(page, rows);//利用Pagehelper插件进行数据库查询分页
		List<Servicett> list =serviceService.selectAllService();
		//创建分页相关信息对象，参数是数据库返回的list
		PageInfo<Servicett> pageInfo = new PageInfo(list);
		//因为datagrid前段组件需要的JSON数据有total和rows两个属性
		//total是表里的总记录数(用PageInfo对象的getTotal方法获取)；rows是当前页需要显示的数据列表
		Map<String,Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", list);
		return map;
	}
	
	@RequestMapping("/deleteService")
	public Map<String,String> deleteService(int serId) {
		serviceService.deleteService(serId);
		Map<String,String> map = new HashMap<>();
		map.put("result", "删除成功");    
		return map;
	}
	
	
	@RequestMapping("/updateService")
	public Map<String,String> updateService(Servicett ser) {
		serviceService.updateService(ser);
		Map<String,String> map = new HashMap<>();
		map.put("result", "修改服务信息成功!");    
		return map;
	}
	
	@RequestMapping("/insertService")
	public Map<String,String> insertService(Servicett ser) {
		serviceService.insertService(ser);
		Map<String,String> map = new HashMap<>();
		map.put("result", "添加服务成功!");    
		return map;
		}
}
