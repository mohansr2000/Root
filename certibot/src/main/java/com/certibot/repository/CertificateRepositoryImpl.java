package com.certibot.repository;

import com.certibot.entity.Certificate;
import com.certibot.vo.CertificateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Repository
public class CertificateRepositoryImpl {

    @PersistenceContext
    EntityManager entityManager;

    public List<Certificate> getAllCertificatesByTenant(Integer tenantId) {

        Query query = entityManager.createQuery("Select c from  Certificate c where c.host.tenant.tenantId =:tenantId  " );
        query.setParameter("tenantId",tenantId);

        List<Certificate> certificates = query.getResultList();
        return certificates;
    }

    // givenDate =  today(4-8-19)  + no.of days
    //  condition: givenDate <= validTo

    public List<Certificate> getExpiredCertificatesByDays(Integer days) {

        LocalDate today = LocalDate.now();    //Today
        LocalDate givenDate = today.plusDays(days);
        Date givenUtilCurrentDate = Date.from(today.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        Date givenUtilDate = Date.from(givenDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());


        Query query = entityManager.createQuery("Select c from  Certificate c where c.validTo >= :givenUtilCurrentDate and c.validTo <= :givenUtilDate " +
                "and c.certificateStatus = :status" );
          query.setParameter("givenUtilDate",givenUtilDate);
          query.setParameter("givenUtilCurrentDate",givenUtilCurrentDate);
          query.setParameter("status","Active");



        List<Certificate> certificates = query.getResultList();
        return certificates;

    }

    public List<Certificate> getAllExpiredCertificates() {

        LocalDate today = LocalDate.now();
        Date givenUtilCurrentDate = Date.from(today.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());


        Query query = entityManager.createQuery("Select c from  Certificate c where c.validTo <= :givenUtilCurrentDate" );
        query.setParameter("givenUtilCurrentDate",givenUtilCurrentDate);

        List<Certificate> certificates = query.getResultList();
        return certificates;

    }

    public List<Certificate> getAllCertificatesByStatus(String status) {

        LocalDate today = LocalDate.now();
        Date givenUtilCurrentDate = Date.from(today.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());


        Query query = entityManager.createQuery("Select c from  Certificate c where c.certificateStatus = :status" );
        query.setParameter("status",status);

        List<Certificate> certificates = query.getResultList();
        return certificates;

    }


    public List<Certificate> getExpiredCertificatesByTenantAndDays(Integer tenantId, Integer days) {
        LocalDate today = LocalDate.now();     //Today
        LocalDate givenDate = today.plusDays(days);
        Date givenUtilCurrentDate = Date.from(today.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        Date givenUtilDate = Date.from(givenDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());


        Query query = entityManager.createQuery("Select c from  Certificate c where c.validTo >= :givenUtilCurrentDate and c.validTo <= :givenUtilDate " +
                " and c.host.tenant.tenantId =:tenantId " );
        query.setParameter("givenUtilDate",givenUtilDate);
        query.setParameter("givenUtilCurrentDate",givenUtilCurrentDate);
        query.setParameter("tenantId",tenantId);
        List<Certificate> certificates = query.getResultList();
        return certificates;
    }

    public List<Certificate> getCertificatesByTenantAndStatus(Integer tenantId, String status) {
        LocalDate today = LocalDate.now();
        Date givenUtilCurrentDate = Date.from(today.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());

        Query query = entityManager.createQuery("Select c from  Certificate c where c.certificateStatus = :status" +
                " and c.host.tenant.tenantId =:tenantId " );
        query.setParameter("status",status);
        query.setParameter("tenantId",tenantId);

        List<Certificate> certificates = query.getResultList();
        return certificates;
    }

    public List<Certificate> getRenewalCertificatesByDays(Integer days) {


//        System.out.println("Days >>>>>>>>>>>>>>"+days);
        LocalDate today = LocalDate.now();    //Today
        LocalDate givenDate = today.plusDays(days);
        Date givenUtilCurrentDate = Date.from(today.atTime(23,59).atZone(ZoneId.systemDefault()).toInstant());
        Date givenUtilDate = Date.from(givenDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());


        Query query = entityManager.createQuery("Select c from  Certificate c where c.renewalDate <= :givenUtilCurrentDate and c.renewalDate >= :givenUtilDate " );
        query.setParameter("givenUtilDate",givenUtilDate);
        query.setParameter("givenUtilCurrentDate",givenUtilCurrentDate);


        List<Certificate> certificates = query.getResultList();

/*
        System.out.println("givenUtilDate>>>>>>>>>>>>>>"+givenUtilDate);
        System.out.println("givenUtilCurrentDate>>>>>>>>>>>>>>"+givenUtilCurrentDate);


        System.out.println("certificates sizee>>>>>>>>>>>>>>"+certificates.size());
        System.out.println("certificates Tostring>>>>>>>>>>>>>>"+certificates.toString());

        certificates.stream().forEach(certificate -> System.out.println("certificate ID"+certificate.getCertificateId()));*/

        return certificates;

    }

    public static void main(String a[]) {
        LocalDate today = LocalDate.now();     //Today
//        LocalDate givenDate = today.plusDays(7);

        Date givenUtilCurrentDate = Date.from(today.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());

        System.out.println(givenUtilCurrentDate);


    }
}
