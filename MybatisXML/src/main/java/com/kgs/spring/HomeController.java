package com.kgs.spring;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class HomeController {
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home";
	}
	
}