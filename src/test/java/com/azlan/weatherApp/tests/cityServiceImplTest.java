package com.azlan.weatherApp.tests;

import com.azlan.weatherApp.model.City;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-context.xml")
//@TestPropertySource(locations = {"classpath:properties/cityProperties.properties"})
public class cityServiceImplTest {

    private static final Logger logger = LoggerFactory.getLogger(cityServiceImplTest.class);

    private ApplicationContext ctx;

    @Before
    public void initData()
    {
        ctx = new ClassPathXmlApplicationContext("classpath:test-context.xml");
    }

    @Test
    public void getCity() throws Exception {

        System.out.println("Autowired Property PlaceHolder Test.");

        boolean result = false;

        City cityWired = ctx.getBean(City.class);

        String[] city = cityWired.getCity();

        if(city != null)
        {
            result = true;
            Integer count  = 0;
            for (String iter: city
                    ) {

                logger.debug("City " + ++count + " is " + iter);
            }
        }

        Assert.assertEquals(true, result);
    }

}