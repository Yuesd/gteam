package com.cqut.dao.model;

public class Crecord {
	private int manId;
	private int cusId;
	private int recordId;
	private int Id;
	private String datetime;
	private String record;
	private String manName;
	private String cusName;
	public int getManId() {
		return manId;
	}
	public void setManId(int manId) {
		this.manId = manId;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public int getRecordId() {
		return recordId;
	}
	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	public String getManName() {
		return manName;
	}
	public void setManName(String manName) {
		this.manName = manName;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	@Override
	public String toString() {
		return "Crecord [manId=" + manId + ", cusId=" + cusId + ", recordId=" + recordId + ", Id=" + Id + ", datetime="
				+ datetime + ", record=" + record + ", manName=" + manName + ", cusName=" + cusName + "]";
	}
}
