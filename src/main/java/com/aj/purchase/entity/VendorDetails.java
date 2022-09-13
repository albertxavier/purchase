package com.aj.purchase.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class VendorDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long vendorId;
	private String vendorName;
	private String vendorAddress;
	private String phoneNumber;
	private String contactPerson;
	private String vendorIdStr;
	public Long getVendorId() {
		return vendorId;
	}
	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorAddress() {
		return vendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	
	public String getVendorIdStr() {
		return vendorIdStr;
	}
	public void setVendorIdStr(String vendorIdStr) {
		this.vendorIdStr = vendorIdStr;
	}
	public VendorDetails() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("VendorDetails entity object created");
	}

	
}
