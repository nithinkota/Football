package com.football.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Data;


@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class FootBall {
	private String country_name;
	private String league_id;
	private String league_name;
	private String team_id;
	private String team_name;
	private String overall_league_position;
	
	
	
}