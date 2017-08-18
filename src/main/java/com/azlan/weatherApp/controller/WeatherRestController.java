package com.azlan.weatherApp.controller;

import com.azlan.weatherApp.model.City;
import com.azlan.weatherApp.model.Weather;
import com.azlan.weatherApp.service.WeatherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class WeatherRestController {

    private static final Logger logger = LoggerFactory.getLogger(WeatherRestController.class);
 
    @Autowired
    WeatherService weatherService;  //Service to get the weather details from the API

    @Autowired
    City city;

    /*
    * To get the weather details from the API
    * @param cityName
    */
    @RequestMapping(value = "/weather/{cityName}", method = RequestMethod.GET)
    public ResponseEntity<Weather> getWeatherDetails(@PathVariable("cityName") String cityName)
    {
        logger.info("Calling getWeatherDetails() method with " + cityName + " as param");
        Weather weather = weatherService.getWeather(cityName);

        if(weather.getCurrentObservation() == null)
        {
            logger.debug("NULL DATA RETURNED");
            return new ResponseEntity<Weather>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Weather>(weather, HttpStatus.OK);
    }

    /*
    * To get the list of cities
    *
    * */
    @RequestMapping(value = "/cityDetails", method = RequestMethod.GET)
    public ResponseEntity<City> getCityDetails()
    {
        logger.info("Calling getCityDetails() method");
        if(city.getCity() != null)
        {
            for (String item: city.getCity()
                 ) {
                logger.debug("This are the cities " + item);
            }
        }

        return new ResponseEntity<City>(city, HttpStatus.OK);
    }
}