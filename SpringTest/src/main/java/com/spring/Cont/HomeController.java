package com.spring.Cont;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String Home(Model model)
	{
		System.out.println("this is home url");
		model.addAttribute("name","Kashinath Dadaso Kolekar ");
		
		List<String> frinds = new ArrayList<String>();
		//frinds.add("Shravani");
		//frinds.add("prathibh");
		frinds.add("kashinath");
		frinds.add("Moraya");
		
		model.addAttribute("f",frinds);
		
		return "home";
	}
	
	@RequestMapping("/about")
	public String About()
	{
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView Help()
	{
		System.out.println("this is help Controller");
		ModelAndView model = new ModelAndView();
		
		model.addObject("name","Kashinath Kolekar");
		List<String> frinds = new ArrayList<String>();
		//frinds.add("Shravani");
		//frinds.add("prathibh");
		frinds.add("kashinath");
		frinds.add("Moraya");
		model.addObject("list",frinds);
		model.setViewName("help");
		
		return model;
	}

}