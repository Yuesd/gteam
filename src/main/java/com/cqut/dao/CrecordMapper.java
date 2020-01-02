package com.cqut.dao;

import java.util.List;

import com.cqut.dao.model.Crecord;

public interface CrecordMapper {
	List<Crecord> selectman();
	List<Crecord> selectcus();
	List<Crecord> selectallcontact();
	List<Crecord> selectrecord(int recordId);
	void insertman(Crecord rcd);
	void insertcontact(Crecord rcd);
	void insertrecord(Crecord rcd);
	void deletecontact(int recordId);
	void deleterecord(int Id);
}
