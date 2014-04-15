package com.dmuruli.wodemo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@MappedSuperclass
public class BaseEntity {

	@Column(name = "CREATED_BY")
	String createdBy;
	@Column(name = "CREATED_TS")
	 @Temporal(TemporalType.TIMESTAMP)
	Date createdTimeStamp;
	@Column(name = "UPDATED_BY")
	String updatedBy;
	@Column(name = "UPDATED_TS")
	Date updatedTimeStamp;
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime
				* result
				+ ((createdTimeStamp == null) ? 0 : createdTimeStamp.hashCode());
		result = prime * result
				+ ((updatedBy == null) ? 0 : updatedBy.hashCode());
		result = prime
				* result
				+ ((updatedTimeStamp == null) ? 0 : updatedTimeStamp.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof BaseEntity))
			return false;
		BaseEntity other = (BaseEntity) obj;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (createdTimeStamp == null) {
			if (other.createdTimeStamp != null)
				return false;
		} else if (!createdTimeStamp.equals(other.createdTimeStamp))
			return false;
		if (updatedBy == null) {
			if (other.updatedBy != null)
				return false;
		} else if (!updatedBy.equals(other.updatedBy))
			return false;
		if (updatedTimeStamp == null) {
			if (other.updatedTimeStamp != null)
				return false;
		} else if (!updatedTimeStamp.equals(other.updatedTimeStamp))
			return false;
		return true;
	}

	
}