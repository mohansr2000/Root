package com.certibot.controller;

import com.certibot.entity.Certificate;
import com.certibot.service.ICertificateService;
import com.certibot.service.ITenantService;
import com.certibot.vo.CertificateCountVo;
import com.certibot.vo.CertificateVo;
import com.certibot.vo.TenantVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CertibotController {

    @Autowired
    ICertificateService certificateService;

    @Autowired
    ITenantService tenantService;


    @RequestMapping(value = "/getAllCertificates", method = RequestMethod.GET)
    public List<CertificateVo> getAllCertificates() {

        List<CertificateVo> certificateVos = certificateService.getAllCertificates();
        return certificateVos;
    }


    @RequestMapping(value = "/getCertificateById/{id}", method = RequestMethod.GET)
    public CertificateVo getCertificatesByID(@PathVariable("id") Integer id) {

        CertificateVo certificateVo = certificateService.getAllCertificatesById(id);
        return certificateVo;
    }

    @RequestMapping(value = "/getCertificatesByTenant/{tenantId}", method = RequestMethod.GET)
    public List<CertificateVo> getAllCertificatesByTenant(@PathVariable("tenantId") Integer tenantId){

        List<CertificateVo> certificateVos = certificateService.getAllCertificatesByTenant(tenantId);
        return certificateVos;
    }

    @RequestMapping(value = "/getExpiredCertificatesByDays/{days}", method = RequestMethod.GET)
    public List<CertificateVo> getExpiredCertificatesByDays(@PathVariable("days") Integer days){

        List<CertificateVo> certificateVos = certificateService.getExpiredCertificatesByDays(days);
        return certificateVos;
    }

    @RequestMapping(value = "/getAllExpiredCertificates", method = RequestMethod.GET)
    public List<CertificateVo> getAllExpiredCertificates(){

        List<CertificateVo> certificateVos = certificateService.getAllExpiredCertificates();
        return certificateVos;
    }

    @RequestMapping(value = "/getAllCertificatesByStatus/{status}", method = RequestMethod.GET)
    public List<CertificateVo> getAllCertificatesByStatus(@PathVariable("status") String status){
        List<CertificateVo> certificateVos = certificateService.getAllCertificatesByStatus(status);
        return certificateVos;
    }


    @RequestMapping(value = "/getExpiredCertificatesByTenantAndDays/{tenantId}/{days}", method = RequestMethod.GET)
    public List<CertificateVo> getExpiredCertificatesByTenantAndDays(@PathVariable("tenantId") Integer tenantId, @PathVariable("days") Integer days){

        List<CertificateVo> certificateVos = certificateService.getExpiredCertificatesByTenantAndDays(tenantId,days);
        return certificateVos;
    }

    @RequestMapping(value = "/getCertificatesByTenantAndStatus/{tenantId}/{status}", method = RequestMethod.GET)
    public List<CertificateVo> getCertificatesByTenantAndStatus(@PathVariable("tenantId") Integer tenantId,@PathVariable("status") String status){
        List<CertificateVo> certificateVos = certificateService.getCertificatesByTenantAndStatus(tenantId,status);
        return certificateVos;
    }

    @RequestMapping(value = "/getAllTenants", method = RequestMethod.GET)
    public List<TenantVo> getAllTenants() {
        List<TenantVo> tenantVos = tenantService.getAllTenants();
        return tenantVos;
    }


    @RequestMapping(value = "/getCertificatesCount", method = RequestMethod.GET)
    public CertificateCountVo getCertificatesCount() {
        CertificateCountVo certificateCountVo = certificateService.getCertificatesCount();
        return certificateCountVo;
    }


}
