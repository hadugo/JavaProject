package com.kgs.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller("/*")
public class HomeController {
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	}

	@RequestMapping(value="doResult", method = RequestMethod.POST)
	@ResponseBody
	public void result(Model model,HttpServletRequest request,  HttpServletResponse response) {

		String code = request.getParameter("code");
		String name = request.getParameter("name");
		model.addAttribute("code", code);
		model.addAttribute("name", name);
		
		System.out.println("Code = " + code + " / name = " + name);
		try {
			PrintWriter writer = response.getWriter();
			writer.println("Code = " + code + " / name = " + name);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
