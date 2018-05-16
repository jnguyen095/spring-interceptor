package com.interceptor.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class MaintenanceController{

	@RequestMapping("/maintenance.html")
	public ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView model = new ModelAndView("MaintenancePage");
		model.addObject("classname", "MaintenanceController");
		
		return model;
	}

	@RequestMapping("/sorry.html")
	public ModelAndView sorry(HttpServletRequest request,
											  HttpServletResponse response) throws Exception {

		ModelAndView model = new ModelAndView("Sorry");
		model.addObject("classname", "MaintenanceController");

		return model;
	}

}