package com.ims.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ims.app.model.SKU;

@Repository
public interface SKURepository extends JpaRepository<SKU, Long> {
    SKU findBySkuCode(String skuCode);
}

