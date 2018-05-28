package com.SNU.JS.Controller;

import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RserveException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SNU.JS.DTO.numberDTO;
import com.SNU.JS.IService.rService;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	public rService rSrv;
	
	@RequestMapping(value = "/")
	public String home(Model model) throws RserveException, REXPMismatchException {
		model.addAttribute("retStr", rSrv.calR("10", "30"));
		return "home";
	}
	@RequestMapping(value = "/cal")
	public String cal(Model model, @RequestParam String num1, @RequestParam String num2) throws RserveException, REXPMismatchException {
		logger.info(num1);
		model.addAttribute("retStr", rSrv.calR(num1, num2));
		return "home";
	}
	
}
