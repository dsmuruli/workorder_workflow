package com.dmuruli.wodemo.entity;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: WorkOrderStatus
 *
 */
@Entity
@Table(name = "WORK_ORDER_STATUS")
public class WorkOrderStatus implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="WORK_ORDER_STATUS_ID")
	private Long workOrderStatusId;
	@Column(name="STATUS_NAME")
	private String statusName;
	@Column(name="STATUS_NOTES")
	private String statusNotes;
	private static final long serialVersionUID = 1L;

	public WorkOrderStatus() {
		super();
	}   
	public Long getWorkOrderStatusId() {
		return this.workOrderStatusId;
	}

	public void setWorkOrderStatusId(Long workOrderStatusId) {
		this.workOrderStatusId = workOrderStatusId;
	}   
	public String getStatusName() {
		return this.statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}   
	public String getStatusNotes() {
		return this.statusNotes;
	}

	public void setStatusNotes(String statusNotes) {
		this.statusNotes = statusNotes;
	}
   
}
