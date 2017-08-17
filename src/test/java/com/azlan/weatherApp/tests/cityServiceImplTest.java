package com.azlan.weatherApp.tests;

import com.azlan.weatherApp.model.City;
import com.azlan.weatherApp.service.cityServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-context.xml")
//@TestPropertySource(locations = {"classpath:properties/cityProperties.properties"})
public class cityServiceImplTest {

    private static final Logger logger = LoggerFactory.getLogger(cityServiceImplTest.class);

    private ApplicationContext ctx;

    @Autowired
    private cityServiceImpl cityServiceImpl;

    @Before
    public void initData()
    {
        cityServiceImpl = new cityServiceImpl();
        ctx = new ClassPathXmlApplicationContext("classpath:test-context.xml");
    }

    @Test
    public void getCity() throws Exception {

        System.out.println("Autowired Property PlaceHolder Test.");

        City cityWired = ctx.getBean(City.class);




//        City city = new City();
//        logger.debug(String.valueOf(cityWired.getCity()));
        String[] country = cityWired.getCountry();
        String[] city = cityWired.getCity();

        Integer count  = 0;
        for (String iter: country
             ) {

            logger.debug("Country " + ++count + " is " + iter);
        }

        count  = 0;
        for (String iter: city
                ) {

            logger.debug("City " + ++count + " is " + iter);
        }
        logger.debug(cityWired.toString());

        cityWired.getCountry();
    }

}