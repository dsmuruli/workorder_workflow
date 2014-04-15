package com.dmuruli.wodemo.entity;
import java.util.List;
import java.util.ArrayList;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
 @Table(name = "WORK_ORDER")
@NamedQueries({
	@NamedQuery(name="findAllWorkOrders", query="select w From WorkOrder w"),
	 @NamedQuery(name="findWorkOrdersByStatus", query="select w From WorkOrder w where w.workOrderStatus.workOrderStatusId=:workOrderStatusId")
})

@XmlRootElement(name = "workorder")
public class WorkOrder extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="WORK_ORDER_ID", nullable=false, unique=true)
	Long workOrderId;
	@Column(name="CONTACT_NAME")
	String contactName;
	@Column(name="TITLE")
	String title;
	@Column(name="DESCRIPTION")
	String description;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="WORK_ORDER_STATUS_ID")
	WorkOrderStatus workOrderStatus;
	@ManyToMany
	  @JoinTable(name="WORK_ORDER_TECHNICIAN",
	  joinColumns={@JoinColumn(name="WORK_ORDER_ID", insertable=false, updatable=false, referencedColumnName="WORK_ORDER_ID")},
	  inverseJoinColumns={@JoinColumn(name="TECHNICIAN_ID", referencedColumnName="APP_USER_ID")})
	   List<AppUser> technicians;
	@OneToOne
	  @JoinTable(name="WORK_ORDER_EXPEDITOR",
	  joinColumns={@JoinColumn(name="WORK_ORDER_ID", insertable=false, updatable=false, referencedColumnName="WORK_ORDER_ID")},
	  inverseJoinColumns={@JoinColumn(name="EXPEDITOR_ID", referencedColumnName="APP_USER_ID")})
	   AppUser expeditor;
	
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
	
	
	public List<AppUser> getTechnicians() {
		return technicians;
	}
	public void setTechnicians(List<AppUser> technicians) {
		this.technicians = technicians;
	}
	
	public AppUser getExpeditor() {
		return expeditor;
	}
	public void setExpeditor(AppUser expeditor) {
		this.expeditor = expeditor;
	}
	
	/**
	 * @return the workOrderStatus
	 */
	public WorkOrderStatus getWorkOrderStatus() {
		return workOrderStatus;
	}
	/**
	 * @param workOrderStatus the workOrderStatus to set
	 */
	public void setWorkOrderStatus(WorkOrderStatus workOrderStatus) {
		this.workOrderStatus = workOrderStatus;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((contactName == null) ? 0 : contactName.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((expeditor == null) ? 0 : expeditor.hashCode());
		result = prime * result
				+ ((technicians == null) ? 0 : technicians.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result
				+ ((workOrderId == null) ? 0 : workOrderId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WorkOrder other = (WorkOrder) obj;
		if (contactName == null) {
			if (other.contactName != null)
				return false;
		} else if (!contactName.equals(other.contactName))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (expeditor == null) {
			if (other.expeditor != null)
				return false;
		} else if (!expeditor.equals(other.expeditor))
			return false;
		if (technicians == null) {
			if (other.technicians != null)
				return false;
		} else if (!technicians.equals(other.technicians))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (workOrderId == null) {
			if (other.workOrderId != null)
				return false;
		} else if (!workOrderId.equals(other.workOrderId))
			return false;
		return true;
	}
	
	
	

}
