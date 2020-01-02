package com.cqut.dao;

import java.util.List;
import com.cqut.dao.model.Servicett;
public interface ServiceMapper {
	void insertService(Servicett ser);
	List<Servicett> selectAllService();
	
	void deleteService(int serId);
	void updateService(Servicett ser);
	
}
