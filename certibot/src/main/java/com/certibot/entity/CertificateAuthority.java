package com.certibot.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the certificate_authority database table.
 * 
 */
@Entity
@Table(name="certificate_authority")
@NamedQuery(name="CertificateAuthority.findAll", query="SELECT c FROM CertificateAuthority c")
public class CertificateAuthority implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="authority_id")
	private int authorityId;

	@Column(name="authority_desc")
	private String authorityDesc;

	@Column(name="authority_name")
	private String authorityName;

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

	@Column(name="temp_field1")
	private String tempField1;

	@Column(name="temp_field2")
	private String tempField2;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	private String updatedby;

	//bi-directional many-to-one association to Certificate
	@OneToMany(mappedBy="certificateAuthority")
	private List<Certificate> certificates;

	//bi-directional many-to-one association to Notification
	@OneToMany(mappedBy="certificateAuthority")
	private List<Notification> notifications;

	public CertificateAuthority() {
	}

	public int getAuthorityId() {
		return this.authorityId;
	}

	public void setAuthorityId(int authorityId) {
		this.authorityId = authorityId;
	}

	public String getAuthorityDesc() {
		return this.authorityDesc;
	}

	public void setAuthorityDesc(String authorityDesc) {
		this.authorityDesc = authorityDesc;
	}

	public String getAuthorityName() {
		return this.authorityName;
	}

	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
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

	public List<Certificate> getCertificates() {
		return this.certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}

	public Certificate addCertificate(Certificate certificate) {
		getCertificates().add(certificate);
		certificate.setCertificateAuthority(this);

		return certificate;
	}

	public Certificate removeCertificate(Certificate certificate) {
		getCertificates().remove(certificate);
		certificate.setCertificateAuthority(null);

		return certificate;
	}

	public List<Notification> getNotifications() {
		return this.notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public Notification addNotification(Notification notification) {
		getNotifications().add(notification);
		notification.setCertificateAuthority(this);

		return notification;
	}

	public Notification removeNotification(Notification notification) {
		getNotifications().remove(notification);
		notification.setCertificateAuthority(null);

		return notification;
	}

}