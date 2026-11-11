package com.parth.projectsafequery.repository;

import com.parth.projectsafequery.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Integer> {
}
