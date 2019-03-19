package com.arwest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.arwest.domain.Feedback;
import com.arwest.domain.Person;

@Controller
public class HomeController {
	
	private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/home")
	public String home(Model model){
		
		Person person = new Person();
		
		
		model.addAttribute("person", person);
		
		
		return "home";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public void homePost(@ModelAttribute("person") Person person) {
		LOG.info("adding a person with info as: {}", person);
		
		System.out.println(person);
	}
	
	@RequestMapping("/about")
	public String aboutPage(){
		
		return "about";
		
	}
	@RequestMapping("/contact")
	public String contact(Model model) {
		
		Feedback feedback = new Feedback();
		
		model.addAttribute("feedback", feedback);
		
		return "contact";
	}
	
}
