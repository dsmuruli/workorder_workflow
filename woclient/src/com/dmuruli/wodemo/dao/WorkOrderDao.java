package com.dmuruli.wodemo.dao;
import org.springframework.stereotype.Component;

import com.dmuruli.wodemo.entity.WorkOrder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import java.util.List;
import java.util.ArrayList;
@Component
public class WorkOrderDao {
	@PersistenceContext
	 private EntityManager entityManager;
	
	  public List<WorkOrder>findAll(){
		    List<WorkOrder> workOrderList = new ArrayList<WorkOrder>();
		    workOrderList =entityManager.createNamedQuery("findAllWorkOrders").getResultList();
		    return workOrderList;
		  }
	  public int findAssignedWorkOrdersCount(long appUserId){
		  int assignedWorkOrdersCount =0;
		  return assignedWorkOrdersCount;
	  }
	  @SuppressWarnings("unchecked")
	public List<WorkOrder> findWorkOrdersByStatus(long appUserId, Long statusId){
		  List<WorkOrder> workOrderList = new ArrayList<WorkOrder>();
		  workOrderList =entityManager.createNamedQuery("findWorkOrdersByStatus")
				  .setParameter("workOrderStatusId", statusId)
				  .getResultList();
		  
		  return workOrderList;
	  }
	  private List<WorkOrder> findWorkOrdersByNamedQuery(long appUserId, String namedQuery){
		  List<WorkOrder> workOrderList = new ArrayList<WorkOrder>();
		  workOrderList =entityManager.createNamedQuery(namedQuery).getResultList();	  
		  return workOrderList;
	  }
	  
	  public int findOpenWorkOrders(long appUserId){
		  int openWorkOrdersCount =0;
		  return openWorkOrdersCount;
	  }
	  public int findCompletedWorkOrders(long appUserId){
		  int completedWorkOrdersCount =0;
		  
		  return completedWorkOrdersCount;
	  }
	  public WorkOrder saveWorkOrder(WorkOrder workOrder){
		     WorkOrder savedWorkOrder =entityManager.merge(workOrder);      
		     return savedWorkOrder;
		  }
	  public void createWorkOrder(WorkOrder workOrder){
		  entityManager.persist(workOrder);  
	  }
}
