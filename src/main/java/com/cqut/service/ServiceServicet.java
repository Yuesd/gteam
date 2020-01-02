package com.cqut.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cqut.dao.ServiceMapper;
import com.cqut.dao.model.Servicett;

@org.springframework.stereotype.Service
public class ServiceServicet {


	@Autowired
	private ServiceMapper cerMapper;
	
	public List<Servicett> selectAllService()
	{
		return cerMapper.selectAllService();
	}
	
	public void deleteService(int serId) 
	{
		cerMapper.deleteService(serId);
	}
	
	public void updateService(Servicett ser) 
	{
		cerMapper.updateService(ser);
	}
	
	public void insertService(Servicett cus) {
		cerMapper.insertService(cus);
	}
}
