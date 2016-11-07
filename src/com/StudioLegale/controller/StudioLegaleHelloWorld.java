package com.StudioLegale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: 
 * 
 */
 

@Controller
public class StudioLegaleHelloWorld {
 
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>*****welcome controller***** Ciao:</h3>Questo messaggio viene dal Controller della classe StudioLegaleHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}



	@RequestMapping("/login")
	public ModelAndView login() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>*****login Controller***** Ciao:</h3>Questo messaggio viene dal Controller della classe StudioLegaleHelloWorld.java **********</div><br><br>";
		return new ModelAndView("login", "message", message);
	}
	
	@RequestMapping("/dashboard")
	public ModelAndView dashboard() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>*****login Controller***** Ciao:</h3>Questo messaggio viene dal Controller della classe StudioLegaleHelloWorld.java **********</div><br><br>";
		return new ModelAndView("dashboard", "message", message);
	}
}