package com.search_marketing_db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.search_marketing_db.dto.Lead;

@Controller
public class SearchLeadController {
	
	@Autowired
	RestClient rest;
	
	@RequestMapping("/view")
	public String viewSearchPage() {
		return "search_location_by_id";
	}
      
	@RequestMapping("/getLeadId")
	public String getLeadId(@RequestParam("id") long id, ModelMap model) {
		Lead lead = rest.getOneLeadById(id);
		model.put("lead", lead);
		return "lead_info";
	}
}
