package com.parth.projectsafequery.repository;

import com.parth.projectsafequery.entity.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantRepository extends JpaRepository<Tenant, Integer> {
}
