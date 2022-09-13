package com.aj.purchase.dto;

public interface PurchaseDetailsView {
	 Long getBillId();
	 String getBillNo();
	 String getVendorId();
	 Long getBillAmount();
	 Long getAmountPaid();
	 String getVendorName();
	 String getVendorPhoneNumber();
}
