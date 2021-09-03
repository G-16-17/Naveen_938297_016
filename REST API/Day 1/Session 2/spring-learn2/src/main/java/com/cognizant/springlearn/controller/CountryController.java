package com.cognizant.springlearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.exception.CountryNotFoundException;
import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;

@RestController
public class CountryController {
	
	@Autowired
	CountryService countryService;
	
	@RequestMapping(method=RequestMethod.GET,value="/country")
	public Country getCountryIndia() {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("country.xml");
		Country country=context.getBean("in",Country.class);
		return country;
		
	}
	
	@GetMapping("/countries")
	public List<Country> getAllCountry(){
		ApplicationContext context= new ClassPathXmlApplicationContext("country.xml");
		List<Country> countryList=context.getBean("countryList",java.util.ArrayList.class);
		return countryList;
	}
	
	@GetMapping("/countries/{code}")
	public Country getCountry(@PathVariable String code) throws CountryNotFoundException  {
		return countryService.getCountry(code);
	}
	

}
