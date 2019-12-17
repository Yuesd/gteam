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
	public Map<String, Object> getAllContect(int page,int rows){//page , rows是easyui的datagrid提交的参数
		PageHelper.startPage(page, rows);//利用Pagehelper插件进行数据库查询分页
		List<Crecord> list =crecordService.getAllContact();
		//创建分页相关信息对象，参数是数据库返回的list
		PageInfo<Crecord> pageInfo = new PageInfo(list);
		//因为datagrid前段组件需要的JSON数据有total和rows两个属性
		//total是表里的总记录数(用PageInfo对象的getTotal方法获取)；rows是当前页需要显示的数据列表
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
		map.put("result", "成功添加经理信息。");
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
		map.put("result", "删除交往 信息成功");    
		return map;
	}
}
