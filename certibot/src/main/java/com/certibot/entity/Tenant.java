package com.certibot.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the tenant database table.
 * 
 */
@Entity
@NamedQuery(name="Tenant.findAll", query="SELECT t FROM Tenant t")
public class Tenant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="tenant_id")
	private int tenantId;

	private String contact1;

	private String contact2;

	private String contact3;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_date")
	private Date createDate;

	private String createdby;

	@Column(name="temp_field1")
	private String tempField1;

	@Column(name="temp_field2")
	private String tempField2;

	@Column(name="temp_field3")
	private String tempField3;

	@Column(name="tenant_desc")
	private String tenantDesc;

	@Column(name="tenant_name")
	private String tenantName;

	@Column(name="tenant_website")
	private String tenantWebsite;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	private String updatedby;

	//bi-directional many-to-one association to Host
	@OneToMany(mappedBy="tenant")
	private List<Host> hosts;

	//bi-directional many-to-one association to Notification
	@OneToMany(mappedBy="tenant")
	private List<Notification> notifications;

	public Tenant() {
	}

	public int getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}

	public String getContact1() {
		return this.contact1;
	}

	public void setContact1(String contact1) {
		this.contact1 = contact1;
	}

	public String getContact2() {
		return this.contact2;
	}

	public void setContact2(String contact2) {
		this.contact2 = contact2;
	}

	public String getContact3() {
		return this.contact3;
	}

	public void setContact3(String contact3) {
		this.contact3 = contact3;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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

	public String getTempField3() {
		return this.tempField3;
	}

	public void setTempField3(String tempField3) {
		this.tempField3 = tempField3;
	}

	public String getTenantDesc() {
		return this.tenantDesc;
	}

	public void setTenantDesc(String tenantDesc) {
		this.tenantDesc = tenantDesc;
	}

	public String getTenantName() {
		return this.tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public String getTenantWebsite() {
		return this.tenantWebsite;
	}

	public void setTenantWebsite(String tenantWebsite) {
		this.tenantWebsite = tenantWebsite;
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

	public List<Host> getHosts() {
		return this.hosts;
	}

	public void setHosts(List<Host> hosts) {
		this.hosts = hosts;
	}

	public Host addHost(Host host) {
		getHosts().add(host);
		host.setTenant(this);

		return host;
	}

	public Host removeHost(Host host) {
		getHosts().remove(host);
		host.setTenant(null);

		return host;
	}

	public List<Notification> getNotifications() {
		return this.notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public Notification addNotification(Notification notification) {
		getNotifications().add(notification);
		notification.setTenant(this);

		return notification;
	}

	public Notification removeNotification(Notification notification) {
		getNotifications().remove(notification);
		notification.setTenant(null);

		return notification;
	}

}