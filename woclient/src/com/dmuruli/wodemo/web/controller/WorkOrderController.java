package com.dmuruli.wodemo.web.controller;
import javax.servlet.http.HttpServletResponse;

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
	@RequestMapping(value="/getSampleWorkOrder", method = RequestMethod.GET, produces="application/json")
	public  @ResponseBody WorkOrder getSampleWorkOrder(HttpServletResponse response){
		WorkOrder workOrder = new WorkOrder();
		workOrder.setContactName("Jos Schmoe");
		workOrder.setDescription("Sample Work Order");
		workOrder.setTitle("Test Work Order");
		workOrder.setWorkOrderId(2323232311L);
		logger.info("Returning Sample Work Order");
		//response.setHeader(arg0, arg1);
		//response.geth
		return workOrder;
	}
	@RequestMapping(value="/myworkorders")
	public ModelAndView getWorkOrders(){
		logger.info("Entered workorders overview");
		ModelAndView mav = new ModelAndView("myworkordersview");
		return mav;
	}
	@RequestMapping(value="/openworkorders")
	public ModelAndView getOpenWorkOrders(){
		ModelAndView mav = new ModelAndView("openworkorders");
		return mav;
	}
	@RequestMapping(value="/assignedworkorders")
	public ModelAndView getAssignedWorkOrders(){
		ModelAndView mav = new ModelAndView("assignedworkorders");
		return mav;
	}
}
