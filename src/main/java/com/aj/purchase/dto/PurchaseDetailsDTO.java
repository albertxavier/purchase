package com.aj.purchase.dto;

import java.io.Serializable;

public class PurchaseDetailsDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8239172993564207337L;
	private Long billId;
	private String billNo;
	private String vendorId;
	private Long billAmount;
	private Long amountPaid;
	private String vendorName;
	private String vendorPhoneNumber;
	public PurchaseDetailsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PurchaseDetailsDTO(Long billId, String billNo, String vendorId, Long billAmount, Long amountPaid,
			String vendorName, String vendorPhoneNumber) {
		super();
		this.billId = billId;
		this.billNo = billNo;
		this.vendorId = vendorId;
		this.billAmount = billAmount;
		this.amountPaid = amountPaid;
		this.vendorName = vendorName;
		this.vendorPhoneNumber = vendorPhoneNumber;
	}
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
	
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorPhoneNumber() {
		return vendorPhoneNumber;
	}
	public void setVendorPhoneNumber(String vendorPhoneNumber) {
		this.vendorPhoneNumber = vendorPhoneNumber;
	}

}
