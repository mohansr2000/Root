package com.certibot.service;

import com.certibot.entity.Certificate;
import com.certibot.helper.CertibotHelper;
import com.certibot.repository.CertificateRepository;
import com.certibot.repository.CertificateRepositoryImpl;
import com.certibot.vo.CertificateCountVo;
import com.certibot.vo.CertificateVo;
import com.certibot.vo.CountVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class CertificateServiceImpl implements ICertificateService {

    @Autowired
    CertificateRepository certificateRepository;

    @Autowired
    CertificateRepositoryImpl certificateRepositoryImpl;

    @Autowired
    CertibotHelper certibotHelper;

    @Override
    public List<CertificateVo> getAllCertificates() {
       List<Certificate>  certificates = certificateRepository.findAll();
       List<CertificateVo>  certificateVos = null;
        if(certificates != null){
            certificateVos = new ArrayList<CertificateVo>();
            certificateVos = certificates.stream().map
                    (certificate -> certibotHelper.prepareCertificateVo(certificate)).collect(Collectors.toList());
        }

       return certificateVos;
    }

    @Override
    public CertificateVo getAllCertificatesById(Integer id) {
        Optional<Certificate> certificateOptional =  certificateRepository.findById(id);
        CertificateVo certificateVo = null;
        if(certificateOptional.isPresent()){
            certificateVo =  certibotHelper.prepareCertificateVo(certificateOptional.get());
        }
        return certificateVo;
    }

    @Override
    public List<CertificateVo> getAllCertificatesByTenant(Integer tenantid) {

        List<Certificate>  certificates = certificateRepositoryImpl.getAllCertificatesByTenant(tenantid);
        List<CertificateVo>  certificateVos = null;
        if(certificates != null){
            certificateVos = new ArrayList<CertificateVo>();
            certificateVos = certificates.stream().map
                    (certificate -> certibotHelper.prepareCertificateVo(certificate)).collect(Collectors.toList());
        }

        return certificateVos;
    }

    @Override
    public List<CertificateVo> getExpiredCertificatesByDays(Integer days) {
        List<Certificate>  certificates = certificateRepositoryImpl.getExpiredCertificatesByDays(days);
        List<CertificateVo>  certificateVos = null;
        if(certificates != null){
            certificateVos = new ArrayList<CertificateVo>();
            certificateVos = certificates.stream().map
                    (certificate -> certibotHelper.prepareCertificateVo(certificate)).collect(Collectors.toList());
        }

        return certificateVos;

    }

    @Override
    public List<CertificateVo> getAllExpiredCertificates() {
        List<Certificate>  certificates = certificateRepositoryImpl.getAllExpiredCertificates();
        List<CertificateVo>  certificateVos = null;
        if(certificates != null){
            certificateVos = new ArrayList<CertificateVo>();
            certificateVos = certificates.stream().map
                    (certificate -> certibotHelper.prepareCertificateVo(certificate)).collect(Collectors.toList());
        }

        return certificateVos;

    }

    @Override
    public List<CertificateVo> getAllCertificatesByStatus(String status) {
        List<Certificate>  certificates = certificateRepositoryImpl.getAllCertificatesByStatus(status);
        List<CertificateVo>  certificateVos = null;
        if(certificates != null){
            certificateVos = new ArrayList<CertificateVo>();
            certificateVos = certificates.stream().map
                    (certificate -> certibotHelper.prepareCertificateVo(certificate)).collect(Collectors.toList());
        }

        return certificateVos;

    }

    @Override
    public List<CertificateVo> getExpiredCertificatesByTenantAndDays(Integer tenantId, Integer days) {
        List<Certificate>  certificates = certificateRepositoryImpl.getExpiredCertificatesByTenantAndDays(tenantId, days);
        List<CertificateVo>  certificateVos = null;
        if(certificates != null){
            certificateVos = new ArrayList<CertificateVo>();
            certificateVos = certificates.stream().map
                    (certificate -> certibotHelper.prepareCertificateVo(certificate)).collect(Collectors.toList());
        }

        return certificateVos;

    }

    @Override
    public List<CertificateVo> getCertificatesByTenantAndStatus(Integer tenantId, String status) {
        List<Certificate>  certificates = certificateRepositoryImpl.getCertificatesByTenantAndStatus(tenantId,status);
        List<CertificateVo>  certificateVos = null;
        if(certificates != null){
            certificateVos = new ArrayList<CertificateVo>();
            certificateVos = certificates.stream().map
                    (certificate -> certibotHelper.prepareCertificateVo(certificate)).collect(Collectors.toList());
        }

        return certificateVos;

    }

    @Override
    public CertificateCountVo getCertificatesCount() {

        CertificateCountVo certificateCountVo = new CertificateCountVo();
        CountVo expiredCount = new CountVo();
        List<Certificate>  expiresToday = certificateRepositoryImpl.getExpiredCertificatesByDays(1);
        List<Certificate>  expiresThisWeek = certificateRepositoryImpl.getExpiredCertificatesByDays(7);
        List<Certificate>  expiresThisMonth = certificateRepositoryImpl.getExpiredCertificatesByDays(30);
        List<Certificate>  expiresThisQuarter = certificateRepositoryImpl.getExpiredCertificatesByDays(90);

        expiredCount.setToday(expiresToday!= null ? expiresToday.size() : null);
        expiredCount.setWeek(expiresThisWeek!= null ? expiresThisWeek.size() : null);
        expiredCount.setMonth(expiresThisMonth!= null ? expiresThisMonth.size() : null);
        expiredCount.setQuarter(expiresThisQuarter!= null ? expiresThisQuarter.size() : null);


        CountVo renewalCount = new CountVo();

        List<Certificate>  renewalToday = certificateRepositoryImpl.getRenewalCertificatesByDays(0);
        List<Certificate>  renewalThisWeek = certificateRepositoryImpl.getRenewalCertificatesByDays(-7);
        List<Certificate>  renewalThisMonth = certificateRepositoryImpl.getRenewalCertificatesByDays(-30);
        List<Certificate>  renewalThisQuarter = certificateRepositoryImpl.getRenewalCertificatesByDays(-90);

        renewalCount.setToday(renewalToday!= null ? renewalToday.size() : null);
        renewalCount.setWeek(renewalThisWeek!= null ? renewalThisWeek.size() : null);
        renewalCount.setMonth(renewalThisMonth!= null ? renewalThisMonth.size() : null);
        renewalCount.setQuarter(renewalThisQuarter!= null ? renewalThisQuarter.size() : null);

        certificateCountVo.setExpiredData(expiredCount);
        certificateCountVo.setRenewedData(renewalCount);



        List<Certificate>  totalCertificates = certificateRepository.findAll();
        List<Certificate>  totalActiveCertificates = certificateRepositoryImpl.getAllCertificatesByStatus("Active");
        List<Certificate>  totalExpiredCertificates = certificateRepositoryImpl.getAllCertificatesByStatus("Expired");

        certificateCountVo.setTotalCertificates(totalCertificates != null ? totalCertificates.size() : null);
        certificateCountVo.setTotalActiveCertificates(totalActiveCertificates != null ? totalActiveCertificates.size() : null);
        certificateCountVo.setTotalExpiredCertificates(totalExpiredCertificates != null ? totalExpiredCertificates.size() : null);
        return certificateCountVo;
    }
}
