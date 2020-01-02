package com.cqut.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cqut.dao.CrecordMapper;
import com.cqut.dao.model.Crecord;

@Service
public class CrecordService {
	@Autowired
	private CrecordMapper recordmapper;
	public List<Crecord> getMan() {
		return recordmapper.selectman();
	}
	public List<Crecord> getCus(){
		return recordmapper.selectcus();
	}
	public List<Crecord> getAllContact(){
		return recordmapper.selectallcontact();
	}
	public List<Crecord> getRecord(int recordId){
		return recordmapper.selectrecord(recordId);
	}
	public void addMan(Crecord rcd) {
		recordmapper.insertman(rcd);
	}
	public void addContact(Crecord rcd) {
		recordmapper.insertcontact(rcd);
	}
	public void addRecord(Crecord rcd) {
		recordmapper.insertrecord(rcd);
	}
	public void delContact(int recordId) {
		recordmapper.deletecontact(recordId);
	}
	public void delRecord(int Id) {
		recordmapper.deleterecord(Id);
	}
}
