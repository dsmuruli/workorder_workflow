package com.dmuruli.wodemo.entity;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: AppUser
 *
 */
@Entity
@Table(name = "APP_USER")
public class AppUser implements Serializable {

	   
	@Id
	private Long appUserId;
	private String firstName;
	private String lastName;
	private Role role;
	private Address contactAddress;
	private String contactPhone;
	private String userName;
	private String password;
	private Boolean verified;
	private boolean locked;
	private static final long serialVersionUID = 1L;

	public AppUser() {
		super();
	}   
	public Long getAppUserId() {
		return this.appUserId;
	}

	public void setAppUserId(Long appUserId) {
		this.appUserId = appUserId;
	}   
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}   
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}   
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}   
	public Address getContactAddress() {
		return this.contactAddress;
	}

	public void setContactAddress(Address contactAddress) {
		this.contactAddress = contactAddress;
	}   
	public String getContactPhone() {
		return this.contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getVerified() {
		return verified;
	}
	public void setVerified(Boolean verified) {
		this.verified = verified;
	}
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
   
}
