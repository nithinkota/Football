package com.football.FootballController;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.football.controller.FootballController;

public class FootballControllerTest extends FootballApplicationTests {

	private MockMvc mockMvc;

	@Autowired
	private FootballController footballController;

	@Before
	public void setup() throws IOException {
		this.mockMvc = standaloneSetup(footballController).build();
	}

	@Test
	public void statusTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/football/getdata").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());

	}
	
	@Test
	public void countryTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/football/getdata").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(MockMvcResultMatchers.jsonPath("[0].country_name").exists());

	}

}
