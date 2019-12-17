package com.cqut.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cqut.dao.model.Customer;
import com.cqut.service.Customerservice;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private Customerservice customerService;

	@RequestMapping("isId")
	public Map<String, Object> isId(Customer cus) {
		
		
		
		List<Customer> list = customerService.isId(cus.getCusNo());
		Map<String, Object> map = new HashMap<String, Object>();
//		System.out.println("-----------"+list.size() );
		try {
			if (list.size() > 0) {
				map.put("result", "编号已存在,请重新输入");
			} else {
				map.put("result", "编号不存在，可以添加");
			}
			return map;
		} catch (Exception e) {
			map.put("result", "编号不存在，可以添加");
			return map;
		}

	}

	@RequestMapping("/addCustomer")
	public Map<String, Object> addCustomer(Customer cus) {
//		System.out.println(cus);
		customerService.addCustomer(cus);
		Map<String, Object> map = new HashMap<>();
		map.put("result", "添加成功");

		return map;
	}

	@RequestMapping("/getAllCustomer")
	public Map<String, Object> getAllCustomer(int page, int rows) {// page , rows是easyui的datagrid提交的参数
		PageHelper.startPage(page, rows);// 利用Pagehelper插件进行数据库查询分页
		List<Customer> list = customerService.getAllCustomer();
		// 创建分页相关信息对象，参数是数据库返回的list
		PageInfo<Customer> pageInfo = new PageInfo(list);
		// 因为datagrid前段组件需要的JSON数据有total和rows两个属性
		// total是表里的总记录数(用PageInfo对象的getTotal方法获取)；rows是当前页需要显示的数据列表
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", list);

		return map;
	}

	@RequestMapping("/delCustomer")
	public Map<String, String> delCustomer(int cusId) {
		customerService.delCustomer(cusId);
		Map<String, String> map = new HashMap<>();
		map.put("result", "删除成功");
		return map;

	}

	@RequestMapping("/updateCustomer")
	public Map<String, String> updateCustomer(Customer cus) {
		customerService.updateCustomer(cus);
		Map<String, String> map = new HashMap<>();
		map.put("result", "修改成功");
		return map;
	}

	@RequestMapping("/getCustomerNo")
	public List<Customer> getCustomerNo() {
		return customerService.getAllCustomer();
	}

}
