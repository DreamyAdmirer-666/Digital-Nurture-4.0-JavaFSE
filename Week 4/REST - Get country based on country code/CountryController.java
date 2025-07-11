package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.Country;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    private static final Logger LOGGER= LoggerFactory.getLogger(CountryController.class);
    @RequestMapping("/country")
    public Country getCountryIndia(){
        LOGGER.debug("Start of getCountryIndia()");
        try(ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("country.xml")){
            Country country=context.getBean("country", Country.class);
            LOGGER.debug("End of getCountryIndia()");
            return country;
        }
        
    }

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code){
        LOGGER.debug("Start of getCountry() with code:{}", code);
        try(ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("country.xml")){
            @SuppressWarnings("unchecked")
            List<Country> countryList=(List<Country>) context.getBean("countryList");
            return countryList.stream()
                    .filter(c ->c.getCode().equalsIgnoreCase(code))
                    .findFirst()
                    .orElse(null);
        }
    }
}
