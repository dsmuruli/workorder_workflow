package com.dmuruli.wodemo.dao.test;

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
	}

}
