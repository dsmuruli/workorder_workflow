package com.dmuruli.wodemo.entity;

import java.util.Date;

import javax.persistence.Column;

public class BaseEntity {

	@Column(name = "CREATED_BY")
	AppUser createdBy;
	@Column(name = "CREATED_TS")
	Date createdTimeStamp;
	@Column(name = "UPDATED_BY")
	AppUser updatedBy;
	@Column(name = "UPDATED_TS")
	Date updatedTimeStamp;

	public BaseEntity() {
		super();
	}

}