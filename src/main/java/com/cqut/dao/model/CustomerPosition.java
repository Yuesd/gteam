package com.cqut.dao.model;

public class CustomerPosition {
	private String cusLevel;
	private String num;
	public String getCusLevel() {
		return cusLevel;
	}
	public void setCusLevel(String cusLevel) {
		this.cusLevel = cusLevel;
	}
	public String getNum() {
		return num;
	}
	public void setCount(String num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "CustomerPosition [cusLevel=" + cusLevel + ", count=" + num + "]";
	}
}
