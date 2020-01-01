package com.certibot.vo;

import com.certibot.entity.Host;
import com.certibot.entity.Notification;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Data
public class TenantVo implements Serializable {

	private int tenantId;
	private String tenantName;
	private String tenantWebsite;
	private String tenantDesc;
	private String contact1;
	private String contact2;
	private String contact3;
	private String tempField1;
	private String tempField2;
	private String tempField3;



}