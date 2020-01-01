package com.certibot.service;

import com.certibot.entity.Tenant;
import com.certibot.helper.CertibotHelper;
import com.certibot.repository.TenantRepository;
import com.certibot.vo.TenantVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TenantService implements ITenantService {

    @Autowired
    TenantRepository tenantRepository;

    @Autowired
    CertibotHelper certibotHelper;

    @Override
    public List<TenantVo> getAllTenants() {

        List<Tenant>  certificates = tenantRepository.findAll();
        List<TenantVo>  tenantVos = null;
        if(certificates != null){
            tenantVos = new ArrayList<TenantVo>();
            tenantVos = certificates.stream().map
                    (tenant -> certibotHelper.prepareTenantVo(tenant)).collect(Collectors.toList());
        }

        return tenantVos;


    }
}
