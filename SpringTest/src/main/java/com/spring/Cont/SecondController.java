package com.spring.Cont;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.Model.User;
import com.spring.service.UserService;



@Controller
public class SecondController {
	
	//@Autowired
	//private UserService userService;
	
	//@Autowired
	//private Servicelay userser;
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void Common(Model m)
	{
		m.addAttribute("Header","Learn With Kashi");
		m.addAttribute("Des","Home for Programing");
	}

	@RequestMapping("/contact")
	public String showFrom(Model m)
	{
		
		return "Contact";
	}
	
	
	@RequestMapping(path="/processfrom",method = RequestMethod.POST)
	public String HandlFrom(@ModelAttribute User user,Model m)
	{
		
		//this.userser.createUser(user);
		
		this.userService.CreateUser(user);
		return "success";
	}
	

}
