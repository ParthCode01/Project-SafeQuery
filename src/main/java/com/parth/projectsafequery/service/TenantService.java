package com.parth.projectsafequery.service;

import com.parth.projectsafequery.entity.Tenant;
import com.parth.projectsafequery.repository.TenantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TenantService {


    private final TenantRepository tenantRepository;

    public TenantService(TenantRepository tenantRepository){
        this.tenantRepository = tenantRepository;
    }

    public List<Tenant> getAllTenants(){
        return tenantRepository.findAll();
    }

    public Optional<Tenant> getTenantById(Integer id){
        return tenantRepository.findById(id);
    }

    public void deleteTenantById(Integer id){
        tenantRepository.deleteById(id);
    }

    public Tenant saveTenant(Tenant tenant){
        return tenantRepository.save(tenant);
    }

}
