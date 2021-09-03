package com.cognizant.springlearn;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions
;
import com.cognizant.springlearn.controller.CountryController;

@SpringBootTest
@AutoConfigureMockMvc
class SpringLearnApplicationTests {

	@Autowired
	CountryController countryController;
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	void contextLoads() {
		assertNotNull(countryController);
	}
	
	@Test
	public void testGetCountry() throws Exception {
		ResultActions action=mvc.perform(get("/country"));
		action.andExpect(status().isOk());
		action.andExpect(jsonPath("$.code").exists());
		action.andExpect(jsonPath("$.code").value("IN"));
		action.andExpect(jsonPath("$.name").exists());
		action.andExpect(jsonPath("$.name").value("India"));
		
	}
	
	@Test
	public void testGetCountryExceptuon() throws Exception {
		ResultActions action=mvc.perform(get("/countries/az"));
		//action.andExpect(status().isOk());
		action.andExpect(status().isNotFound());
		action.andExpect(status().reason("Country not found"));

		
		
	}

}
