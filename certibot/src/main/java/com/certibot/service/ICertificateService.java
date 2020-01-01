package com.certibot.service;

import com.certibot.vo.CertificateCountVo;
import com.certibot.vo.CertificateVo;

import java.util.List;

public interface ICertificateService {

    public List<CertificateVo> getAllCertificates();
    public  CertificateVo getAllCertificatesById(Integer id);
    public List<CertificateVo> getAllCertificatesByTenant(Integer tenantId);
    public List<CertificateVo> getExpiredCertificatesByDays( Integer days);
    public List<CertificateVo> getAllExpiredCertificates();
    public List<CertificateVo> getAllCertificatesByStatus(String status);
    public List<CertificateVo> getExpiredCertificatesByTenantAndDays(Integer tenantId , Integer days);
    public List<CertificateVo> getCertificatesByTenantAndStatus(Integer tenantId , String status);
    public CertificateCountVo getCertificatesCount();

}
