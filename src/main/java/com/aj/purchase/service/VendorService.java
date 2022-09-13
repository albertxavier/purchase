package com.aj.purchase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aj.purchase.entity.VendorDetails;
import com.aj.purchase.repository.VendorRepository;
@Service
public class VendorService implements VendorServiceI{
    
	@Autowired
	VendorRepository vendorRepository;
	
	@Override
	public List<VendorDetails> getAllVendors() {
		// TODO Auto-generated method stub
		return vendorRepository.findAll();
	}

	public VendorService() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("VendorService object created");
		System.out.println("vendorRepository in "+vendorRepository+" VendorService object created");
		}

	@Override
	public VendorDetails createVendorDetails(VendorDetails details) {
		// TODO Auto-generated method stub
		return vendorRepository.save(details);
	}

	@Override
	public VendorDetails updateVendorDetails(VendorDetails details) {
		// TODO Auto-generated method stub
		return vendorRepository.save(details);
	}

	@Override
	public void deleteVendorDetails(VendorDetails details) {
		// TODO Auto-generated method stub
		 vendorRepository.delete(details);;
	}

	@Override
	public VendorDetails getVendorDetailsById(Long vendorId) {
		// TODO Auto-generated method stub
		return vendorRepository.getVendorDetailsByVendorId(vendorId);
	}

	@Override
	public List<VendorDetails> getVendorDetailsByName(String vendorName) {
		// TODO Auto-generated method stub
		return vendorRepository.getVendorDetailsByVendorName(vendorName);
	}

}
