package com.azlan.weatherApp.tests;

import com.azlan.weatherApp.model.CurrentObservation;
import com.azlan.weatherApp.model.Weather;
import com.azlan.weatherApp.service.WeatherService;
import com.azlan.weatherApp.service.WeatherServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-context.xml")
public class WeatherServiceImplTest {

    private static final Logger logger = LoggerFactory.getLogger(WeatherServiceImplTest.class);

    private ApplicationContext ctx;

    @Before
    public void initData()
    {
        ctx = new ClassPathXmlApplicationContext("classpath:test-context.xml");
    }

    @Test
    public void getWeatherPass() throws Exception {

        String cityName = "Sydney";
        boolean result = false;
        WeatherService weatherService = new WeatherServiceImpl();

        Weather weather = weatherService.getWeather(cityName);


        if(weather.getCurrentObservation() != null)
        {
            logger.info("Getting current observation " + weather.getCurrentObservation().toString());
            result = true;
        }


        Assert.assertEquals(true, result);
    }

    @Test
    public void getWeatherFail() throws Exception {

        String cityName = "Perth";
        boolean result = true;
        WeatherService weatherService = new WeatherServiceImpl();

        Weather weather = weatherService.getWeather(cityName);

        if(weather.getCurrentObservation() == null)
        {
            logger.info("There is no data for " + cityName);
            result = false;
        }


        Assert.assertEquals(false, result);
    }

}