package com.search_marketing_db.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.search_marketing_db.dto.Lead;

@Component
public class RestClient {
	
	public Lead getOneLeadById(long id) {
		RestTemplate restTemplate = new RestTemplate();
		Lead lead = restTemplate.getForObject("http://localhost:8080/getapi/"+ id, Lead.class);
		return lead;
	}

}
