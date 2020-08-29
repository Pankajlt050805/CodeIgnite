package com.code.ignite.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;
	private String role;
	private String emailId;
	private String companyId;
	private Date createDate;
	private Date billableStartDate;
	private Date billableEndDate;
	private int allocationPercentage;
	private boolean isBillable;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getBillableStartDate() {
		return billableStartDate;
	}

	public void setBillableStartDate(Date billableStartDate) {
		this.billableStartDate = billableStartDate;
	}

	public Date getBillableEndDate() {
		return billableEndDate;
	}

	public void setBillableEndDate(Date billableEndDate) {
		this.billableEndDate = billableEndDate;
	}

	public int getAllocationPercentage() {
		return allocationPercentage;
	}

	public void setAllocationPercentage(int allocationPercentage) {
		this.allocationPercentage = allocationPercentage;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public boolean isBillable() {
		return isBillable;
	}

	public void setBillable(boolean isBillable) {
		this.isBillable = isBillable;
	}

}
