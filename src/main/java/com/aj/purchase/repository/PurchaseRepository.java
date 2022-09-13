package com.aj.purchase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aj.purchase.entity.Purchase;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Long>{

}
