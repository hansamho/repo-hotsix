package com.hotsix.infra.product;

import java.util.Date;

public class ProductDto {

	private String productSeq;
	private String productName;
	private String productCode;
	private String productPrice;
	private Integer productTypeCd;
	private Integer productAccount;
	private Date productRegDate;
	private Date productModDate;
	private Integer productDelNy;
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
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public Integer getProductTypeCd() {
		return productTypeCd;
	}
	public void setProductTypeCd(Integer productTypeCd) {
		this.productTypeCd = productTypeCd;
	}
	public Integer getProductAccount() {
		return productAccount;
	}
	public void setProductAccount(Integer productAccount) {
		this.productAccount = productAccount;
	}
	public Date getProductRegDate() {
		return productRegDate;
	}
	public void setProductRegDate(Date productRegDate) {
		this.productRegDate = productRegDate;
	}
	public Date getProductModDate() {
		return productModDate;
	}
	public void setProductModDate(Date productModDate) {
		this.productModDate = productModDate;
	}
	public Integer getProductDelNy() {
		return productDelNy;
	}
	public void setProductDelNy(Integer productDelNy) {
		this.productDelNy = productDelNy;
	}
	public String getProductSeq() {
		return productSeq;
	}
	public void setProductSeq(String productSeq) {
		this.productSeq = productSeq;
	}
	
}
