package com.kgs.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kgs.spring.dto.EmployDTO;
import com.kgs.spring.service.EmployService;

@Controller
@RequestMapping("/employ/*")
public class EmployController {
	
	@Inject
	EmployService employService;
	
	
	@RequestMapping("SimpleMybatisTest")
	public String simpleMybatisTest(Model model) {

		try {
			List<EmployDTO> list = employService.getEmployList();
			model.addAttribute("list_1", list);
		} catch (Exception e) {
			outputResult(model, "Get List Error : " + e.getMessage());
			e.printStackTrace();
			return "employ/result";
		}

		try {
			int i = employService.deleteEmploy();
			model.addAttribute("deleteCnt", i);
		} catch (Exception e) {
			outputResult(model, "Delete all records error : " + e.getMessage());
			return "employ/result";
		}

		try {
			List<EmployDTO> list = new ArrayList<EmployDTO>();
			list.add(new EmployDTO("00001", "양현진"));
			list.add(new EmployDTO("00002", "박혜정"));
			list.add(new EmployDTO("00003", "이유미"));
			list.add(new EmployDTO("00004", "이영애"));
			int i = employService.insertEmploy(list);
			model.addAttribute("insertCnt", i);
		} catch (Exception e) {
			outputResult(model, "Insert 4 records error : " + e.getMessage());
			return "employ/result";
		}

		outputResult(model, "");
		
		return "employ/result";
	}
	
	@RequestMapping("MybatisTransactionTest")
	public String mybatisTransactionTest(Model model) {
		try {
			employService.insertEmploy();
			outputResult(model, "");
		} catch (Exception e) {
			outputResult(model, e.getMessage());
			e.printStackTrace();
		}
		return "employ/result";
	}
	
	public void outputResult(Model model, String msg) {
		try {
			List<EmployDTO> list = employService.getEmployList();
			model.addAttribute("list_2", list);
			model.addAttribute("msg", msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
}
