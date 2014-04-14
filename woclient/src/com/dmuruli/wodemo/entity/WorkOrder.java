package com.dmuruli.wodemo.entity;
import java.util.List;
import java.util.ArrayList;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
 @Table(name = "WORK_ORDER")
  @NamedQuery(name="findAllWorkOrders", query="select w From WorkOrder w")
@XmlRootElement(name = "workorder")
public class WorkOrder extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="WORK_ORDER_ID", nullable=false, unique=true)
	Long workOrderId;
	String contactName;
	@Column(name="TITLE")
	String title;
	@Column(name="DESCRIPTION")
	String description;
	@Column (name="ASSIGNED_TO")
	AppUser assignedTo;
	public Long getWorkOrderId() {
		return workOrderId;
	}
	@XmlElement
	public void setWorkOrderId(Long workOrderId) {
		this.workOrderId = workOrderId;
	}
	public String getContactName() {
		return contactName;
	}
	@XmlElement
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getTitle() {
		return title;
	}
	@XmlElement
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	@XmlElement
	public void setDescription(String description) {
		this.description = description;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((contactName == null) ? 0 : contactName.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result
				+ ((workOrderId == null) ? 0 : workOrderId.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		WorkOrder other = (WorkOrder) obj;
		if (contactName == null) {
			if (other.contactName != null) {
				return false;
			}
		} else if (!contactName.equals(other.contactName)) {
			return false;
		}
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		if (workOrderId == null) {
			if (other.workOrderId != null) {
				return false;
			}
		} else if (!workOrderId.equals(other.workOrderId)) {
			return false;
		}
		return true;
	}
	

}
