package com.aj.purchase.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;





@Entity
public class Purchase implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long billId;
	private String billNo;
	private String vendorId;
	private Long billAmount;
	private Long amountPaid;
	@Column(name="paidBy")
	private String paidByAdmin;
	
	@Transient
	private Integer balanceAmount;
	public Long getBillId() {
		return billId;
	}
	public void setBillId(Long billId) {
		this.billId = billId;
	}
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public Long getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(Long billAmount) {
		this.billAmount = billAmount;
	}
	public Long getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(Long amountPaid) {
		this.amountPaid = amountPaid;
	}
	
	public Integer getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(Integer balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getPaidByAdmin() {
		return paidByAdmin;
	}
	public void setPaidByAdmin(String paidByAdmin) {
		this.paidByAdmin = paidByAdmin;
	}
	
	
}
