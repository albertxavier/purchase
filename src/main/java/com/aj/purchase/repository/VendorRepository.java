package com.aj.purchase.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aj.purchase.dto.PurchaseDetailsDTO;
import com.aj.purchase.dto.PurchaseDetailsView;
import com.aj.purchase.entity.Purchase;
import com.aj.purchase.entity.VendorDetails;

public interface VendorRepository extends JpaRepository<VendorDetails, Long>{
	
	List<VendorDetails> getVendorDetailsByVendorName(String vendorName);
	VendorDetails getVendorDetailsByVendorId(Long vendorId);
	List<VendorDetails> findByVendorNameAndVendorId(String vendorName,Long vendorId);
	@Query(value="select v from VendorDetails v")
	List<VendorDetails> testQuery();
	@Query(value="select v from Purchase v")
	List<Purchase> testQuery1();
	
	@Query(value = "select p.billId,p.billNo,p.vendorId,p.billAmount,p.amountPaid,v.vendorName,"
			+ "v.phoneNumber from Purchase p, VendorDetails v where p.vendorId=v.vendorIdStr")
	List<Object> getPurchaseDetails();
	
	//@Query(value = "select p.billId,p.billNo,p.vendorId,p.billAmount,p.amountPaid,v.vendorName,"
			//+ "v.phoneNumber from Purchase p, VendorDetails v where p.vendorId=v.vendorIdStr")
	@Query(value = "select new com.aj.purchase.dto.PurchaseDetailsDTO(p.billId,p.billNo,p.vendorId,p.billAmount,p.amountPaid,v.vendorName,"
			+ "v.phoneNumber) from Purchase p, VendorDetails v where p.vendorId=v.vendorIdStr")
	List<PurchaseDetailsDTO> getPurchaseDetails1();
	
}
