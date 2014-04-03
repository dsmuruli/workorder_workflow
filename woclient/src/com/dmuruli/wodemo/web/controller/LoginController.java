package com.dmuruli.wodemo.web.controller;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class LoginController
{

private static final Logger logger = Logger.getLogger(LoginController.class);

@RequestMapping(value="/login")
public ModelAndView login(@RequestParam(value="username")String username,
@RequestParam(value="password")String password){
  logger.info("The user name is: " + username +" the password is : " + password);
  ModelAndView mav = new ModelAndView("myworkorders");
  return mav;
} 
}