package com.certibot.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the notification database table.
 * 
 */
@Entity
@NamedQuery(name="Notification.findAll", query="SELECT n FROM Notification n")
public class Notification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="notification_id")
	private int notificationId;

	private String acknowledgement;

	@Column(name="contact_id")
	private String contactId;

	@Column(name="contact_type")
	private String contactType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	private String createdby;

	@Column(name="notification_desc")
	private String notificationDesc;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="notification_send_date")
	private Date notificationSendDate;

	@Column(name="notification_status")
	private String notificationStatus;

	@Column(name="notification_type")
	private String notificationType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	private String updatedby;

	//bi-directional many-to-one association to Certificate
	@ManyToOne
	@JoinColumn(name="certificate_id")
	private Certificate certificate;

	//bi-directional many-to-one association to CertificateAuthority
	@ManyToOne
	@JoinColumn(name="authority_id")
	private CertificateAuthority certificateAuthority;

	//bi-directional many-to-one association to Host
	@ManyToOne
	@JoinColumn(name="host_id")
	private Host host;

	//bi-directional many-to-one association to Tenant
	@ManyToOne
	@JoinColumn(name="tenant_id")
	private Tenant tenant;

	public Notification() {
	}

	public int getNotificationId() {
		return this.notificationId;
	}

	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}

	public String getAcknowledgement() {
		return this.acknowledgement;
	}

	public void setAcknowledgement(String acknowledgement) {
		this.acknowledgement = acknowledgement;
	}

	public String getContactId() {
		return this.contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getContactType() {
		return this.contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
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

	public String getNotificationDesc() {
		return this.notificationDesc;
	}

	public void setNotificationDesc(String notificationDesc) {
		this.notificationDesc = notificationDesc;
	}

	public Date getNotificationSendDate() {
		return this.notificationSendDate;
	}

	public void setNotificationSendDate(Date notificationSendDate) {
		this.notificationSendDate = notificationSendDate;
	}

	public String getNotificationStatus() {
		return this.notificationStatus;
	}

	public void setNotificationStatus(String notificationStatus) {
		this.notificationStatus = notificationStatus;
	}

	public String getNotificationType() {
		return this.notificationType;
	}

	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
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

	public Certificate getCertificate() {
		return this.certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
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

	public Tenant getTenant() {
		return this.tenant;
	}

	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}

}