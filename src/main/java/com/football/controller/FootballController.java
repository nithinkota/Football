package com.football.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//@RestController("/football")
public class FootballController {
	
	
	
	 RestTemplate restTemplate = new RestTemplate();
	
	@GetMapping("/hi")
	public void method() {
		
		String url="https://apiv2.apifootball.com/?action=get_standings&league_id=148&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978";
		
		ResponseEntity<String> blockedListResponse = this.restTemplate.getForEntity(url, String.class);
				System.out.println("blockedListResponse   "+blockedListResponse.getBody());
	}
	
	
	
	

}
