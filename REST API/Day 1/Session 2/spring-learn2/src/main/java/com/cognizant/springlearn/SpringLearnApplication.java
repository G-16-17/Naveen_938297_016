package com.cognizant.springlearn;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.model.Country;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER= LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		
	}
	
	public static void displayDate() {
		ApplicationContext context= new ClassPathXmlApplicationContext("date-format.xml");
		LOGGER.info("START");
		SimpleDateFormat format= context.getBean("dateFormat", SimpleDateFormat.class);
		Date date=null;
		try {
			date = format.parse("31/12/2018");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LOGGER.debug("Date "+ date);
		
		LOGGER.info("END");
		
	}
	public static void displayCountry() {
		ApplicationContext context= new ClassPathXmlApplicationContext("country.xml");
		LOGGER.info("START");
		Country country=context.getBean("in",Country.class);
		Country anotherCountry=context.getBean("in",Country.class);
		
		LOGGER.debug("Country {}",country.toString());
		
		LOGGER.info("END");
		
	}
	public static void displayCountries() {
		ApplicationContext context= new ClassPathXmlApplicationContext("country.xml");
		LOGGER.info("START");
		List<Country> countryList=context.getBean("countryList",java.util.ArrayList.class);
		
		
		LOGGER.debug("Country {}",countryList.toString());
		
		LOGGER.info("END");
		
	} 
	
	

}
