package com.dmuruli.wodemo.web.controller;
import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dmuruli.wodemo.entity.WorkOrder;
@Controller
public class WorkOrderController {
	private static final Logger logger = Logger.getLogger(WorkOrderController.class);
	@RequestMapping(value="/getSampleWorkOrder",produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public  @ResponseBody WorkOrder getSampleWorkOrder(){
		WorkOrder workOrder = new WorkOrder();
		workOrder.setContactName("Jos Schmoe");
		workOrder.setDescription("Sample Work Order");
		workOrder.setTitle("Test Work Order");
		workOrder.setWorkOrderId(2323232311L);
		logger.info("Returnting Sample Work Order");
		return workOrder;
	}
}
