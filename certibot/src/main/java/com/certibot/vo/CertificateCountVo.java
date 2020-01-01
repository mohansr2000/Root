package com.certibot.vo;

import lombok.Data;

@Data
public class CertificateCountVo {
    Integer totalCertificates;
    Integer totalActiveCertificates;
    Integer totalExpiredCertificates;

    CountVo expiredData;
    CountVo renewedData;

}
