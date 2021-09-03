package com.cognizant.springlearn.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.exception.CountryNotFoundException;
import com.cognizant.springlearn.model.Country;

@Service
public class CountryService {
	
	
	public Country getCountry(String code) throws CountryNotFoundException  {
		ApplicationContext context= new ClassPathXmlApplicationContext("country.xml");
		List<Country> countryList=context.getBean("countryList",java.util.ArrayList.class);
		int f=0;
		Country country=null;
		for(Country c: countryList) {
			if(c.getCode().equals(code)) {
				f=1;
				country=c; 
			}
		}
		if(f==0) {
			throw new CountryNotFoundException("Not found");
		}
		return country;
		
		
		
	}

}
