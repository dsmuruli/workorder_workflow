package com.dmuruli.wodemo.dao.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dmuruli.wodemo.dao.WorkOrderDao;
import com.dmuruli.wodemo.entity.WorkOrder;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:testContext.xml")
public class WorkOrderDaoTest {
	@Autowired
	WorkOrderDao workOrderDao;
	@Test
	public void testFindAllWorkOrders(){

		List<WorkOrder> workOrders =workOrderDao.findAll();
		System.out.println(" No. of work orders: " + workOrders.size());
		assertTrue( "No work orders retrieved",workOrders.size()>0);
	}
	@Test
	public void testFindAssignedWorkOrders(){
		long ASSIGNED_STATUS=2;
		long TEST_USER_JIM_TECHNICIAN=3;
		List<WorkOrder>assignedWorkOrders = workOrderDao.findWorkOrdersByStatus(TEST_USER_JIM_TECHNICIAN, ASSIGNED_STATUS);
		assertTrue( "No assigned work orders retrieved",assignedWorkOrders.size()>0);
		assertTrue( "No of expected assigned work orders is 3 but found " + assignedWorkOrders.size(),
				assignedWorkOrders.size()==3);
	}
	@Test
	public void testFindCompletedWorkOrders(){
		long COMPLETED_STATUS=2;
		long TEST_USER_JIM_TECHNICIAN=3;
		List<WorkOrder>assignedWorkOrders = workOrderDao.findWorkOrdersByStatus(TEST_USER_JIM_TECHNICIAN, COMPLETED_STATUS);
		assertTrue( "No completed work orders retrieved",assignedWorkOrders.size()>0);
		assertTrue( "No of expected assigned work orders is 3 but found " + assignedWorkOrders.size(),
				assignedWorkOrders.size()==3);
	}
	@Test
	public void testFindOpenWorkOrders(){
		long OPEN_STATUS=2;
		long TEST_USER_JIM_TECHNICIAN=3;
		List<WorkOrder>assignedWorkOrders = workOrderDao.findWorkOrdersByStatus(TEST_USER_JIM_TECHNICIAN, OPEN_STATUS);
		assertTrue( "No assigned work orders retrieved",assignedWorkOrders.size()>0);
		assertTrue( "No of expected work orders with status open is 3 but found " + assignedWorkOrders.size(),
				assignedWorkOrders.size()==3);
	}
	@Test
	public void testFindClosedWorkOrders(){
		long CLOSED_STATUS=2;
		long TEST_USER_JIM_TECHNICIAN=3;
		List<WorkOrder>assignedWorkOrders = workOrderDao.findWorkOrdersByStatus(TEST_USER_JIM_TECHNICIAN, CLOSED_STATUS);
		assertTrue( "No closed work orders retrieved",assignedWorkOrders.size()>0);
		assertTrue( "No of expected closed work orders is 3 but found " + assignedWorkOrders.size(),
				assignedWorkOrders.size()==3);
	}
	@Test
	public void testFindCreatedWorkOrders(){
		long CREATE_STATUS=2;
		long TEST_USER_JIM_TECHNICIAN=3;
		List<WorkOrder>createdWorkOrders = workOrderDao.findWorkOrdersByStatus(TEST_USER_JIM_TECHNICIAN, CREATE_STATUS);
		assertTrue( "No assigned work orders retrieved",createdWorkOrders.size()>0);
		assertTrue( "No of expected work orders with create status is 3 but found " + createdWorkOrders.size(),
				createdWorkOrders.size()==3);
	}

}
