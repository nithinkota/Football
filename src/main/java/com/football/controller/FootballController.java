package com.football.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.football.model.FootBall;

@RestController()
@RequestMapping("/football")
public class FootballController {

	RestTemplate restTemplate = new RestTemplate();

	@GetMapping("getdata")
	public List<FootBall> method() {

		String url = "https://apiv2.apifootball.com/?action=get_standings&league_id=148&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978";

		ResponseEntity<FootBall[]> responseEntity = restTemplate.getForEntity(url, FootBall[].class);
		List<FootBall> list = Arrays.asList(responseEntity.getBody());

		return list;

	}

}
