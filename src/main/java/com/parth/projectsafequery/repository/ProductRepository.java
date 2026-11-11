package com.parth.projectsafequery.repository;

import com.parth.projectsafequery.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
