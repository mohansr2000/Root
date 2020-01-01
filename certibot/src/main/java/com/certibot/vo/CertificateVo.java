package com.certibot.vo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
public class CertificateVo implements Serializable {
  private static final long serialVersionUID = 1L;


  private Integer certificateId;
  private Integer hostId;
  private Integer certificateAuthorityId;
  private String certificateAuthorityName;
  private String certificateName;
  private Integer tenantId;
  private String tenantName;
  private String hostName;
  private String certificateType;
  private String certificateStatus;
  private Date validFrom;
  private Date validTo;
  private Date renewalDate;
  private String renewalStatus;
  private String contact1;
  private String contact1Type;
  private String contact2;
  private String contact2Type;
  private String contact3;
  private String contact3Type;



  
}