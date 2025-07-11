package com.cognizant.springlearn.service;

import com.cognizant.springlearn.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CountryService {
    private static final Logger LOGGER=LoggerFactory.getLogger(CountryService.class);
    public Country getCountry(String code){
        LOGGER.debug("Start of getCountry() with code{}",code);
        try(ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("country.xml")){
            
            @SuppressWarnings("unchecked")
            List<Country> countryList = context.getBean("countryList", List.class);
            
            return countryList.stream()
                    .filter(c -> c.getCode().equalsIgnoreCase(code))
                    .findFirst()
                    .orElse(null);
        }
    }
}
