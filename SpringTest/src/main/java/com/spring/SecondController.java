package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.Model.User;


@Controller
public class SecondController {
	
	//@Autowired
	//private UserService userService;
	
	
	
	@ModelAttribute
	public void Common(Model m)
	{
		m.addAttribute("Header","Learn With Kashi");
		m.addAttribute("Des","Home for Programing");
	}

	@RequestMapping("/contact")
	public String showFrom(Model m)
	{
		/*
		 * m.addAttribute("Header","Learn With Kashi");
		 * m.addAttribute("Des","Home for Programing");
		 */
		return "Contact";
	}
	
	
	@RequestMapping(path="/processfrom",method = RequestMethod.POST)
	public String HandlFrom(@ModelAttribute User user,Model m)
	{
		/*
		 * m.addAttribute("Header","Learn With Kashi");
		 * m.addAttribute("Des","Home for Programing");
		 */
		
		
		//this.userService.createUser(user);
		return "success";
	}
	
	/*
	 * @RequestMapping(path="/processfrom",method = RequestMethod.POST) public
	 * String HandlFrom(HttpServletRequest req) { String email =
	 * req.getParameter("email"); System.out.println("User email is "+email);
	 * 
	 * return ""; }
	 */
	
	/*
	 * @RequestMapping(path="/processfrom",method = RequestMethod.POST)
	 
	public String HandlFrom(
			@RequestParam("email") String email,
			@RequestParam("name") String name,
			@RequestParam("pass") String pass,
			Model model)
	{
		
		User user = new User();
		user.setEmail(email);
		user.setName(name);
		user.setPass(pass);
		
		System.out.println(user);
		
		/*
		 * System.out.println("User Email"+email);
		 * System.out.println("User Email"+name); System.out.println("User Email"+pass);
		 */
		
		/*
		 * model.addAttribute("email", email); 
		 * model.addAttribute("name", name);
		 * model.addAttribute("pass",pass);
		 
		
		model.addAttribute("user",user);
		return "success";
	}
	*/
}
