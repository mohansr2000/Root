package com.certibot.helper;

import com.certibot.entity.Certificate;
import com.certibot.entity.Tenant;
import com.certibot.vo.CertificateVo;
import com.certibot.vo.TenantVo;
import org.springframework.stereotype.Component;

@Component
public class CertibotHelper {



    public CertificateVo prepareCertificateVo(Certificate certificate) {
        CertificateVo certVo = null;
        if (null != certificate) {
            certVo = new CertificateVo();
            certVo.setCertificateId(certificate.getCertificateId());
            certVo.setCertificateName(certificate.getCertificateName());
            certVo.setCertificateStatus(certificate.getCertificateStatus());
            certVo.setCertificateType(certificate.getCertificateType());
            certVo.setCertificateAuthorityId(certificate.getCertificateAuthority() != null ? certificate.getCertificateAuthority().getAuthorityId() : null);
            certVo.setCertificateAuthorityName(certificate.getCertificateAuthority() != null ? certificate.getCertificateAuthority().getAuthorityName() : null);
            certVo.setContact1(certificate.getContact1());
            certVo.setContact1Type(certificate.getContact1Type());
            certVo.setContact2(certificate.getContact2());
            certVo.setContact2Type(certificate.getContact2Type());
            certVo.setContact3(certificate.getContact3());
            certVo.setContact3Type(certificate.getContact3Type());
            certVo.setValidFrom(certificate.getValidFrom());
            certVo.setValidTo(certificate.getValidTo());
            certVo.setRenewalDate(certificate.getRenewalDate());
            certVo.setRenewalStatus(certificate.getRenewalStatus());
            if (null != certificate.getHost()) {
                certVo.setHostId(certificate.getHost().getHostId());
                certVo.setHostName(certificate.getHost().getHostName());
                if (null != certificate.getHost().getTenant()) {
                    certVo.setTenantId(certificate.getHost().getTenant().getTenantId());
                    certVo.setTenantName(certificate.getHost().getTenant().getTenantName());
                }

            }
        }
        return certVo;
    }

    public TenantVo prepareTenantVo(Tenant tenant) {
        TenantVo tenantVo = null;
        if (null != tenant) {
            tenantVo = new TenantVo();
            tenantVo.setTenantId(tenant.getTenantId());
            tenantVo.setTenantName(tenant.getTenantName());
            tenantVo.setTenantName(tenant.getTenantName());
            tenantVo.setTenantDesc(tenant.getTenantDesc());
            tenantVo.setContact1(tenant.getContact1());
            tenantVo.setContact2(tenant.getContact2());
        }

        return  tenantVo;
    }

}
