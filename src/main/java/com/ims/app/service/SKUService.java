package com.ims.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.app.model.SKU;
import org.springframework.cache.annotation.Cacheable;
import com.ims.app.repository.SKURepository;

@Service
public class SKUService {

    @Autowired
    private SKURepository skuRepository;

    @Cacheable(value = "skus", key = "'getAllSKUs'")
    public List<SKU> getAllSKUs() {
        return skuRepository.findAll();
    }

    @Cacheable(value = "sku", key = "#skuCode")
    public SKU getSKUByCode(String skuCode) {
        return skuRepository.findBySkuCode(skuCode);
    }

    public SKU createSKU(SKU sku) {
        return skuRepository.save(sku);
    }

    public void deleteSKU(Long id) {
        skuRepository.deleteById(id);
    }

    public SKU updateSKU(SKU sku) {
        return skuRepository.save(sku);
    }
}
