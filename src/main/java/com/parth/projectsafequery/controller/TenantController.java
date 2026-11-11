package com.parth.projectsafequery.controller;

import com.parth.projectsafequery.entity.Tenant;
import com.parth.projectsafequery.service.TenantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tenants")
public class TenantController {

    private final TenantService tenantService;

    public TenantController(TenantService tenantService) {
        this.tenantService = tenantService;
    }

    @GetMapping
    public List<Tenant> getAllTenants(){
        return tenantService.getAllTenants();
    }

    @GetMapping("/{id}")
    public Optional<Tenant> getTenantById(@PathVariable Integer id){
        return tenantService.getTenantById(id);
    }


    @PostMapping
    public Tenant createTenant(@RequestBody Tenant tenant){
        return tenantService.saveTenant(tenant);
    }
    @PutMapping("/{id}")
    public Tenant updateTenant(@PathVariable Integer id , @RequestBody Tenant tenant){
        tenant.setId(id);
        return tenantService.saveTenant(tenant);
    }

    @DeleteMapping("/{id}")
    public void deleteTenant(@PathVariable Integer id){
        tenantService.deleteTenantById(id);
    }
}
