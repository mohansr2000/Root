package com.certibot.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the certificate database table.
 * 
 */
@Entity
@NamedQuery(name="Certificate.findAll", query="SELECT c FROM Certificate c")
public class Certificate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="certificate_id")
	private int certificateId;

	@Column(name="certificate_name")
	private String certificateName;

	@Column(name="certificate_status")
	private String certificateStatus;

	@Column(name="certificate_type")
	private String certificateType;

	private String contact1;

	@Column(name="contact1_type")
	private String contact1Type;

	private String contact2;

	@Column(name="contact2_type")
	private String contact2Type;

	private String contact3;

	@Column(name="contact3_type")
	private String contact3Type;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	private String createdby;

	@Temporal(TemporalType.DATE)
	@Column(name="renewal_date")
	private Date renewalDate;

	@Column(name="renewal_status")
	private String renewalStatus;

	@Column(name="temp_field1")
	private String tempField1;

	@Column(name="temp_field2")
	private String tempField2;

	@Column(name="temp_field3")
	private String tempField3;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	private String updatedby;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="valid_from")
	private Date validFrom;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="valid_to")
	private Date validTo;

	//bi-directional many-to-one association to CertificateAuthority
	@ManyToOne
	@JoinColumn(name="certificate_authority_id")
	private CertificateAuthority certificateAuthority;

	//bi-directional many-to-one association to Host
	@ManyToOne
	@JoinColumn(name="host_id")
	private Host host;

	//bi-directional many-to-one association to Notification
	@OneToMany(mappedBy="certificate")
	private List<Notification> notifications;

	public Certificate() {
	}

	public int getCertificateId() {
		return this.certificateId;
	}

	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}

	public String getCertificateName() {
		return this.certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public String getCertificateStatus() {
		return this.certificateStatus;
	}

	public void setCertificateStatus(String certificateStatus) {
		this.certificateStatus = certificateStatus;
	}

	public String getCertificateType() {
		return this.certificateType;
	}

	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	public String getContact1() {
		return this.contact1;
	}

	public void setContact1(String contact1) {
		this.contact1 = contact1;
	}

	public String getContact1Type() {
		return this.contact1Type;
	}

	public void setContact1Type(String contact1Type) {
		this.contact1Type = contact1Type;
	}

	public String getContact2() {
		return this.contact2;
	}

	public void setContact2(String contact2) {
		this.contact2 = contact2;
	}

	public String getContact2Type() {
		return this.contact2Type;
	}

	public void setContact2Type(String contact2Type) {
		this.contact2Type = contact2Type;
	}

	public String getContact3() {
		return this.contact3;
	}

	public void setContact3(String contact3) {
		this.contact3 = contact3;
	}

	public String getContact3Type() {
		return this.contact3Type;
	}

	public void setContact3Type(String contact3Type) {
		this.contact3Type = contact3Type;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getRenewalDate() {
		return this.renewalDate;
	}

	public void setRenewalDate(Date renewalDate) {
		this.renewalDate = renewalDate;
	}

	public String getRenewalStatus() {
		return this.renewalStatus;
	}

	public void setRenewalStatus(String renewalStatus) {
		this.renewalStatus = renewalStatus;
	}

	public String getTempField1() {
		return this.tempField1;
	}

	public void setTempField1(String tempField1) {
		this.tempField1 = tempField1;
	}

	public String getTempField2() {
		return this.tempField2;
	}

	public void setTempField2(String tempField2) {
		this.tempField2 = tempField2;
	}

	public String getTempField3() {
		return this.tempField3;
	}

	public void setTempField3(String tempField3) {
		this.tempField3 = tempField3;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	public Date getValidFrom() {
		return this.validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Date getValidTo() {
		return this.validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	public CertificateAuthority getCertificateAuthority() {
		return this.certificateAuthority;
	}

	public void setCertificateAuthority(CertificateAuthority certificateAuthority) {
		this.certificateAuthority = certificateAuthority;
	}

	public Host getHost() {
		return this.host;
	}

	public void setHost(Host host) {
		this.host = host;
	}

	public List<Notification> getNotifications() {
		return this.notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public Notification addNotification(Notification notification) {
		getNotifications().add(notification);
		notification.setCertificate(this);

		return notification;
	}

	public Notification removeNotification(Notification notification) {
		getNotifications().remove(notification);
		notification.setCertificate(null);

		return notification;
	}

}