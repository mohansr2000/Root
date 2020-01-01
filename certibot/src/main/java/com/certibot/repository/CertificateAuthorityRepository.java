package com.certibot.repository;

import com.certibot.entity.CertificateAuthority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificateAuthorityRepository extends JpaRepository<CertificateAuthority, Integer>, JpaSpecificationExecutor<CertificateAuthority> {

}