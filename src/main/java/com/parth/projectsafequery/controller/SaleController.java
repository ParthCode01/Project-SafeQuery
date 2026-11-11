package com.parth.projectsafequery.controller;

import com.parth.projectsafequery.entity.Sale;
import com.parth.projectsafequery.service.SaleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sales")
public class SaleController {

    private final SaleService saleService;

    public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }

    @GetMapping
    public List<Sale> getAllSales() {
        return saleService.getAllSales();
    }

    @GetMapping("/{id}")
    public Optional<Sale> getSaleById(@PathVariable Integer id) {
        return saleService.getSaleById(id);
    }

    @PostMapping
    public Sale createSale(@RequestBody Sale sale) {
        return saleService.saveSale(sale);
    }

    @PutMapping("/{id}")
    public Sale updateSale(@PathVariable Integer id, @RequestBody Sale sale) {
        sale.setId(id);
        return saleService.saveSale(sale);
    }

    @DeleteMapping("/{id}")
    public void deleteSale(@PathVariable Integer id) {
        saleService.deleteSaleById(id);
    }
}