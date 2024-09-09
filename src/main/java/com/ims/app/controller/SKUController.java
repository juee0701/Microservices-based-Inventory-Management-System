package com.ims.app.controller;

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

import com.ims.app.model.SKU;
import com.ims.app.service.SKUService;

@RestController
@RequestMapping("/api/skus")
public class SKUController {

    @Autowired
    private SKUService skuService;

    @GetMapping
    public List<SKU> getAllSKUs() {
        return skuService.getAllSKUs();
    }

    @GetMapping("/{skuCode}")
    public SKU getSKUByCode(@PathVariable String skuCode) {
        return skuService.getSKUByCode(skuCode);
    }

    @PostMapping
    public SKU createSKU(@RequestBody SKU sku) {
        return skuService.createSKU(sku);
    }

    @DeleteMapping("/{id}")
    public void deleteSKU(@PathVariable Long id) {
        skuService.deleteSKU(id);
    }

    @PutMapping
    public SKU updateSKU(@RequestBody SKU sku) {
        return skuService.updateSKU(sku);
    }
}
