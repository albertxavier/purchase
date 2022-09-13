package com.aj.purchase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aj.purchase.dto.PurchaseDetailsDTO;
import com.aj.purchase.dto.PurchaseDetailsView;
import com.aj.purchase.entity.Purchase;
import com.aj.purchase.entity.VendorDetails;
import com.aj.purchase.repository.VendorRepository;
import com.aj.purchase.service.VendorServiceI;

@RestController
@RequestMapping("vendor")
public class VendorController {
	
@Autowired
VendorServiceI vendorServiceI;

@Autowired
VendorRepository vendorRepository;
	
@RequestMapping("/test")
public List<VendorDetails> testAPI() {
	return vendorRepository.testQuery();
}

@RequestMapping("/testpost")
public VendorDetails testAPIPost() {
	VendorDetails vendorDetails = new VendorDetails();
	vendorDetails.setVendorName("vendrr");
	vendorDetails.setPhoneNumber("12314");
	return vendorServiceI.createVendorDetails(vendorDetails);
}

@RequestMapping("/test1")
public List<Purchase> testAPI1() {
	return vendorRepository.testQuery1();
}

@GetMapping("getAll")
List<VendorDetails> getAllVendors(){
	List<VendorDetails> vendorDetails = vendorServiceI.getAllVendors();
	return vendorDetails;
}
@PostMapping("addVendor")
VendorDetails createVendor(@RequestBody VendorDetails vendorDetails) {
	
	VendorDetails details = vendorServiceI.createVendorDetails(vendorDetails);
	return details;
}

@PutMapping("updateVendor")
VendorDetails updateVendor(@RequestBody VendorDetails vendorDetails) {
	
	VendorDetails details = vendorServiceI.updateVendorDetails(vendorDetails);
	return details;
}

@DeleteMapping("deleteVendor")
VendorDetails deleteVendor(@RequestBody VendorDetails vendorDetails) {
	try {
		vendorServiceI.deleteVendorDetails(vendorDetails);
	}catch(Exception ex) {
		System.out.println("exception in delete vendor");
	}
	
	return vendorDetails;
}

@GetMapping("getById/{id}")
VendorDetails getByVendorId(@PathVariable Long id){
	VendorDetails vendorDetails = vendorServiceI.getVendorDetailsById(id);
	return vendorDetails;
}

@GetMapping("getByName/{name}")
List<VendorDetails> getByVendorName(@PathVariable String name){
	List<VendorDetails> vendorDetails = vendorServiceI.getVendorDetailsByName(name);
	return vendorDetails;
}

@GetMapping("getByNameTest/{name}/{id}")
List<VendorDetails> getByVendorNameTest(@PathVariable String name,@PathVariable Long id){
	List<VendorDetails> vendorDetails = vendorRepository.findByVendorNameAndVendorId(name,id);
	return vendorDetails;
}

@GetMapping("getPurchaseDetails")
List<Object> getPurchaseDetails(){
	List<Object> purchaseDetails = vendorRepository.getPurchaseDetails();
	//List<PurchaseDetailsDTO> detailsDTOs = (List<PurchaseDetailsDTO>)purchaseDetails;
	return purchaseDetails;
}

@GetMapping("getPurchaseDetails1")
List<PurchaseDetailsDTO> getPurchaseDetails1(){
	List<PurchaseDetailsDTO> purchaseDetails = vendorRepository.getPurchaseDetails1();
	//List<PurchaseDetailsDTO> detailsDTOs = (List<PurchaseDetailsDTO>)purchaseDetails;
	return purchaseDetails;
}

}
