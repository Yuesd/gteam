package com.cqut.dao.model;

public class Customer {
	private int cusId;
	private String cusNo;
	private String cusName;
	private String cusAddr;
	private String cusPhone;
	private String cusLevel;
	private String cusCredit;
	private String cusRegion;
	private String cusTime;
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getcusNo() {
		return cusNo;
	}
	public void setcusNo(String cusNo) {
		this.cusNo = cusNo;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusAddr() {
		return cusAddr;
	}
	public void setCusAddr(String cusAddr) {
		this.cusAddr = cusAddr;
	}
	public String getcusPhone() {
		return cusPhone;
	}
	public void setcusPhone(String cusPhone) {
		this.cusPhone = cusPhone;
	}
	public String getCusLevel() {
		return cusLevel;
	}
	public void setCusLevel(String cusLevel) {
		this.cusLevel = cusLevel;
	}
	public String getCusCredit() {
		return cusCredit;
	}
	public void setCusCredit(String cusCredit) {
		this.cusCredit = cusCredit;
	}
	public String getCusRegion() {
		return cusRegion;
	}
	public void setCusRegion(String cusRegion) {
		this.cusRegion = cusRegion;
	}
	public String getCusTime() {
		return cusTime;
	}
	public void setCusTime(String cusTime) {
		this.cusTime = cusTime;
	}
//	@Override
//	public String toString() {
//		return "Customer [cusId=" + cusId + ", cusNo=" + cusNo + ", cusName=" + cusName + ", cusAddr=" + cusAddr
//				+ ", cusPhone=" + cusPhone + ", cusLevel=" + cusLevel + ", cusCredit=" + cusCredit + ", cusRegion="
//				+ cusRegion + "]";
//	}
	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", " + (cusNo != null ? "cusNo=" + cusNo + ", " : "")
				+ (cusName != null ? "cusName=" + cusName + ", " : "")
				+ (cusAddr != null ? "cusAddr=" + cusAddr + ", " : "")
				+ (cusPhone != null ? "cusPhone=" + cusPhone + ", " : "")
				+ (cusLevel != null ? "cusLevel=" + cusLevel + ", " : "")
				+ (cusCredit != null ? "cusCredit=" + cusCredit + ", " : "")
				+ (cusRegion != null ? "cusRegion=" + cusRegion + ", " : "")
				+ (cusTime != null ? "cusTime=" + cusTime : "") + "]";
	}
	
}
