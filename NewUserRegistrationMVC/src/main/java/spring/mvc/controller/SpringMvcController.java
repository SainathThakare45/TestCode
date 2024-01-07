package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring.mvc.model.Registrationn;


@Controller
public class SpringMvcController {
	
	
	@RequestMapping("/reg")
	public String getRegistrationPage() {
		String regPage = "registration";
		
		return regPage;
	}
	
	@RequestMapping(value = "/addNewUser" , method = RequestMethod.POST)
	public String getResultPageAfterUserValidation(@RequestParam("name") String uname , @RequestParam("city") String ucity , @RequestParam("mobNo") long umobNo , Model model) 
	{
		
		Registrationn useRegistrationn = new Registrationn(uname,ucity,umobNo);
		
		model.addAttribute("name", uname);
		model.addAttribute("city", ucity);
		model.addAttribute("mob_No", umobNo);
		
		String resultPage = "display";
		
		return resultPage;
	}

}
