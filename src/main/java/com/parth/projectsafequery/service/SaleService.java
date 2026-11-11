package com.parth.projectsafequery.service;

import com.parth.projectsafequery.entity.Sale;
import com.parth.projectsafequery.repository.SaleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaleService {

    private final SaleRepository saleRepository;

    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }

    public Optional<Sale> getSaleById(Integer id) {
        return saleRepository.findById(id);
    }

    public Sale saveSale(Sale sale) {
        return saleRepository.save(sale);
    }

    public void deleteSaleById(Integer id) {
        saleRepository.deleteById(id);
    }
}