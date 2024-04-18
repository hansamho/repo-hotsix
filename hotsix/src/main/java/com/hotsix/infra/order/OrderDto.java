package com.hotsix.infra.order;

import java.util.Date;

public class OrderDto {
	
	private String orderSeq;
	private String productName;
	private Integer productPrice;
	private Integer productTypeCd;
	private String memberName;
	private Integer memberTypeCd;
	
	private Date orderRegDate;
	private Date orderModDate;
	private Integer orderDelNy;
	
	private Integer orderAccount;

	public String getOrderSeq() {
		return orderSeq;
	}

	public void setOrderSeq(String orderSeq) {
		this.orderSeq = orderSeq;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getProductTypeCd() {
		return productTypeCd;
	}

	public void setProductTypeCd(Integer productTypeCd) {
		this.productTypeCd = productTypeCd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Integer getMemberTypeCd() {
		return memberTypeCd;
	}

	public void setMemberTypeCd(Integer memberTypeCd) {
		this.memberTypeCd = memberTypeCd;
	}

	public Date getOrderRegDate() {
		return orderRegDate;
	}

	public void setOrderRegDate(Date orderRegDate) {
		this.orderRegDate = orderRegDate;
	}

	public Date getOrderModDate() {
		return orderModDate;
	}

	public void setOrderModDate(Date orderModeDate) {
		this.orderModDate = orderModeDate;
	}

	public Integer getOrderDelNy() {
		return orderDelNy;
	}

	public void setOrderDelNy(Integer orderDelNy) {
		this.orderDelNy = orderDelNy;
	}

	public Integer getOrderAccount() {
		return orderAccount;
	}

	public void setOrderAccount(Integer orderAccount) {
		this.orderAccount = orderAccount;
	}

}
