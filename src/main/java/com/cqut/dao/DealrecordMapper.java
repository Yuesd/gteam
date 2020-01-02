package com.cqut.dao;

import java.util.List;

import com.cqut.dao.model.Dealrecord;

public interface DealrecordMapper {
	void addDealrecord(Dealrecord cr);
	List<Dealrecord> selectALLDealrecord(String cusNo);
	void deleteDealrecord(int ctId);
}
