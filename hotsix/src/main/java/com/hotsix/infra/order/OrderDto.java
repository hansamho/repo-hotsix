package com.hotsix.infra.order;

import java.util.Date;

public class OrderDto {
	
	private String orderProductSeq;
	private String orderSeq;
	private String productName;
	private Integer productPrice;
	private Integer productTypeCd;
	private String memberName;
	private Integer memberTypeCd;
	
	private Date orderProductRegDate;
	private Date orderProductModDate;
	private Integer orderDelNy;
	
	private Integer orderAccount;
	
	private String productSeqF;
	private String memberSeqF;
	private String orderSeqF;
	public String getOrderProductSeq() {
		return orderProductSeq;
	}
	public void setOrderProductSeq(String orderProductSeq) {
		this.orderProductSeq = orderProductSeq;
	}
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
	public Date getOrderProductRegDate() {
		return orderProductRegDate;
	}
	public void setOrderProductRegDate(Date orderProductRegDate) {
		this.orderProductRegDate = orderProductRegDate;
	}
	public Date getOrderProductModDate() {
		return orderProductModDate;
	}
	public void setOrderProductModDate(Date orderProductModDate) {
		this.orderProductModDate = orderProductModDate;
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
	public String getProductSeqF() {
		return productSeqF;
	}
	public void setProductSeqF(String productSeqF) {
		this.productSeqF = productSeqF;
	}
	public String getMemberSeqF() {
		return memberSeqF;
	}
	public void setMemberSeqF(String memberSeqF) {
		this.memberSeqF = memberSeqF;
	}
	public String getOrderSeqF() {
		return orderSeqF;
	}
	public void setOrderSeqF(String orderSeqF) {
		this.orderSeqF = orderSeqF;
	}
	
}
