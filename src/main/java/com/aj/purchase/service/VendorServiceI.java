package com.aj.purchase.service;

import java.util.List;

import com.aj.purchase.entity.VendorDetails;


public interface VendorServiceI {
	
	public List<VendorDetails> getAllVendors();
	public VendorDetails createVendorDetails(VendorDetails details);
	public VendorDetails updateVendorDetails(VendorDetails details);
	public void deleteVendorDetails(VendorDetails details);
	public VendorDetails getVendorDetailsById(Long vendorId);
	public List<VendorDetails> getVendorDetailsByName(String vendorName);

}
