package com.cqut.dao.model;

public class Dealrecord {
    public int getCrId() {
		return crId;
	}
	public void setCrId(int crId) {
		this.crId = crId;
	}
	public String getCusNo() {
		return cusNo;
	}
	public void setCusNo(String cusNo) {
		this.cusNo = cusNo;
	}
	public String getCrDate() {
		return crDate;
	}
	public void setCrDate(String crDate) {
		this.crDate = crDate;
	}
	public String getCrAddress() {
		return crAddress;
	}
	public void setCrAddress(String crAddress) {
		this.crAddress = crAddress;
	}
	public String getCrOutline() {
		return crOutline;
	}
	public void setCrOutline(String crOutline) {
		this.crOutline = crOutline;
	}
	public String getCrInfo() {
		return crInfo;
	}
	public void setCrInfo(String crInfo) {
		this.crInfo = crInfo;
	}
	public String getCrRemark() {
		return crRemark;
	}
	public void setCrRemark(String crRemark) {
		this.crRemark = crRemark;
	}
	private int crId;
    private String cusNo;
    private String crDate;
    private String crAddress;
    private String crOutline;
    private String crInfo;
    private String crRemark;

}
