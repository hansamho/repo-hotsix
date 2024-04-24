package com.hotsix.infra.arrival;

import java.util.Date;

public class ArrivalDto {
	private String arrivalSeq; 
	private String poSeqF; 
	private String productSeqF; 
	private int arrivalAccount;
	private Date arrivalRegDate;
	private Date arrivalModDate; 
	private Integer arrivalDelNy;
	private Integer arrivalUseNy;
	
	// 상품
	private String productName;
	private String productCode;
	private int productPrice;
	private Integer productTypeCd;
	private String companyName;
	
	//회사
	private String companySeqF;
	
	
	//멤버
	private String memberName;
	private Integer memberTypeCd;
	
	
	
	
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
	public String getCompanySeqF() {
		return companySeqF;
	}
	public void setCompanySeqF(String companySeqF) {
		this.companySeqF = companySeqF;
	}
	public String getArrivalSeq() {
		return arrivalSeq;
	}
	public void setArrivalSeq(String arrivalSeq) {
		this.arrivalSeq = arrivalSeq;
	}
	public String getPoSeqF() {
		return poSeqF;
	}
	public void setPoSeqF(String poSeqF) {
		this.poSeqF = poSeqF;
	}
	public String getProductSeqF() {
		return productSeqF;
	}
	public void setProductSeqF(String productSeqF) {
		this.productSeqF = productSeqF;
	}
	public int getArrivalAccount() {
		return arrivalAccount;
	}
	public void setArrivalAccount(int arrivalAccount) {
		this.arrivalAccount = arrivalAccount;
	}
	public Date getArrivalRegDate() {
		return arrivalRegDate;
	}
	public void setArrivalRegDate(Date arrivalRegDate) {
		this.arrivalRegDate = arrivalRegDate;
	}
	public Date getArrivalModDate() {
		return arrivalModDate;
	}
	public void setArrivalModDate(Date arrivalModDate) {
		this.arrivalModDate = arrivalModDate;
	}
	public Integer getArrivalDelNy() {
		return arrivalDelNy;
	}
	public void setArrivalDelNy(Integer arrivalDelNy) {
		this.arrivalDelNy = arrivalDelNy;
	}
	public Integer getArrivalUseNy() {
		return arrivalUseNy;
	}
	public void setArrivalUseNy(Integer arrivalUseNy) {
		this.arrivalUseNy = arrivalUseNy;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public Integer getProductTypeCd() {
		return productTypeCd;
	}
	public void setProductTypeCd(Integer productTypeCd) {
		this.productTypeCd = productTypeCd;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	
	
	
	
}
