package com.cqut.dao.model;

public class Servicett {

	
	private int serId;
	private String serName;//昵称
	private String serGender;//性别
	private int serPhone;//联系电话
	private String serType;//服务类型
	private String serMemo;//备注
	private String cusNo;//关联的编号
	private String matching;//是否分配
	private String serDate;//创建时间
	private String sserDate;//处理时间
	
	
	public int getSerId() {
		return serId;
	}
	public void setSerId(int serId) {
		this.serId = serId;
	}
	public String getSerName() {
		return serName;
	}
	public void setSerName(String serName) {
		this.serName = serName;
	}
	public String getSerGender() {
		return serGender;
	}
	public void setSerGender(String serGender) {
		this.serGender = serGender;
	}
	public int getSerPhone() {
		return serPhone;
	}
	public void setSerPhone(int serPhone) {
		this.serPhone = serPhone;
	}
	public String getSerType() {
		return serType;
	}
	public void setSerType(String serType) {
		this.serType = serType;
	}
	public String getSerMemo() {
		return serMemo;
	}
	public void setSerMemo(String serMemo) {
		this.serMemo = serMemo;
	}
	public String getCusNo() {
		return cusNo;
	}
	public void setCusNo(String cusNo) {
		this.cusNo = cusNo;
	}
	public String getMatching() {
		return matching;
	}
	public void setMatching(String matching) {
		this.matching = matching;
	}
	public String getSerDate() {
		return serDate;
	}
	public void setSerDate(String serDate) {
		this.serDate = serDate;
	}
	public String getSserDate() {
		return sserDate;
	}
	public void setSserDate(String sserDate) {
		this.sserDate = sserDate;
	}
	@Override
	public String toString() {
		return "Servicett [serId=" + serId + ", " + (serName != null ? "serName=" + serName + ", " : "")
				+ (serGender != null ? "serGender=" + serGender + ", " : "") + "serPhone=" + serPhone + ", "
				+ (serType != null ? "serType=" + serType + ", " : "")
				+ (serMemo != null ? "serMemo=" + serMemo + ", " : "") + (cusNo != null ? "cusNo=" + cusNo + ", " : "")
				+ (matching != null ? "matching=" + matching + ", " : "")
				+ (serDate != null ? "serDate=" + serDate + ", " : "")
				+ (sserDate != null ? "sserDate=" + sserDate : "") + "]";
	}
}
