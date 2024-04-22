package com.hotsix.infra.exits;

import java.util.Date;

public class ExitsDto {
	
	private String exitSeq;
	private String orderSeq;
	private String prdouctSeqF;
	private Integer exitAccount;
	private String delivaryNumber;
	private String delivaryName;
	private String deliverName;
	private Integer statusCd;
	private Date exitRegDate;
	private Date exitModDate;
	private Integer exitDelNy;
	public String getExitSeq() {
		return exitSeq;
	}
	public void setExitSeq(String exitSeq) {
		this.exitSeq = exitSeq;
	}
	public String getOrderSeq() {
		return orderSeq;
	}
	public void setOrderSeq(String orderSeq) {
		this.orderSeq = orderSeq;
	}
	public String getPrdouctSeqF() {
		return prdouctSeqF;
	}
	public void setPrdouctSeqF(String prdouctSeqF) {
		this.prdouctSeqF = prdouctSeqF;
	}
	public Integer getExitAccount() {
		return exitAccount;
	}
	public void setExitAccount(Integer exitAccount) {
		this.exitAccount = exitAccount;
	}
	public String getDelivaryNumber() {
		return delivaryNumber;
	}
	public void setDelivaryNumber(String delivaryNumber) {
		this.delivaryNumber = delivaryNumber;
	}
	public String getDelivaryName() {
		return delivaryName;
	}
	public void setDelivaryName(String delivaryName) {
		this.delivaryName = delivaryName;
	}
	public String getDeliverName() {
		return deliverName;
	}
	public void setDeliverName(String deliverName) {
		this.deliverName = deliverName;
	}
	public Integer getStatusCd() {
		return statusCd;
	}
	public void setStatusCd(Integer statusCd) {
		this.statusCd = statusCd;
	}
	public Date getExitRegDate() {
		return exitRegDate;
	}
	public void setExitRegDate(Date exitRegDate) {
		this.exitRegDate = exitRegDate;
	}
	public Date getExitModDate() {
		return exitModDate;
	}
	public void setExitModDate(Date exitModDate) {
		this.exitModDate = exitModDate;
	}
	public Integer getExitDelNy() {
		return exitDelNy;
	}
	public void setExitDelNy(Integer exitDelNy) {
		this.exitDelNy = exitDelNy;
	}
	
}
