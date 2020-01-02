package com.cqut.dao.model;

public class Servicett {

	
	private int serId;//活动编号
	private String serTitle;//活动标题
	private String serType;//服务类型
	private String serMemo;//活动简介
	private String serAddress;//活动地点
	private String serManager;//活动负责人--serManager
	private int serPhone;//联系电话
	private String serApprover;//社区审批人--serApprover
	private String cusProposer;//关联的编号--活动申请人
	private String serMatching;//是否分配--serserMatching
	private String serDate;//创建时间
	private String serDeadline;//处理时间
	
	public int getSerId() {
		return serId;
	}
	public void setSerId(int serId) {
		this.serId = serId;
	}
	public String getSerTitle() {
		return serTitle;
	}
	public void setSerTitle(String serTitle) {
		this.serTitle = serTitle;
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
	public String getSerAddress() {
		return serAddress;
	}
	public void setSerAddress(String serAddress) {
		this.serAddress = serAddress;
	}
	public String getSerManager() {
		return serManager;
	}
	public void setSerManager(String serManager) {
		this.serManager = serManager;
	}
	public String getSerApprover() {
		return serApprover;
	}
	public void setSerApprover(String serApprover) {
		this.serApprover = serApprover;
	}
	public int getSerPhone() {
		return serPhone;
	}
	public void setSerPhone(int serPhone) {
		this.serPhone = serPhone;
	}
	public String getCusProposer() {
		return cusProposer;
	}
	public void setCusProposer(String cusProposer) {
		this.cusProposer = cusProposer;
	}
	public String getSerMatching() {
		return serMatching;
	}
	public void setSerMatching(String serMatching) {
		this.serMatching = serMatching;
	}
	public String getSerDate() {
		return serDate;
	}
	public void setSerDate(String serDate) {
		this.serDate = serDate;
	}
	public String getSerDeadline() {
		return serDeadline;
	}
	public void setSerDeadline(String serDeadline) {
		this.serDeadline = serDeadline;
	}
	@Override
	public String toString() {
		return "Servicett [serId=" + serId + ", " + (serTitle != null ? "serTitle=" + serTitle + ", " : "")
				+ (serType != null ? "serType=" + serType + "," : "")
				+ (serMemo != null ? "serMemo=" + serMemo + ", " : "")
				+ (serAddress != null ? "serAddress=" + serAddress + ", " : "")
				+ (serManager != null ? "serManager=" + serManager + ", " : "") + "serPhone=" + serPhone + ", "
				+ (serApprover != null ? "serApprover=" + serApprover + ", " : "")
				+ (cusProposer != null ? "cusProposer=" + cusProposer + ", " : "")
				+ (serMatching != null ? "serMatching=" + serMatching + ", " : "")
				+ (serDate != null ? "serDate=" + serDate + ", " : "")
				+ (serDeadline != null ? "serDeadline=" + serDeadline : "") + "]";
	}
}
