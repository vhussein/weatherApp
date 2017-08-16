package com.azlan.weatherApp.service;


import com.azlan.weatherApp.model.Weather;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service("weatherService")
public class WeatherServiceImpl implements WeatherService {

    private static final Logger logger = LoggerFactory.getLogger(WeatherServiceImpl.class);

    @Override
    public Weather getWeather(String cityName) {

        String endPoint = "http://api.wunderground.com/api/249fab9755e4ad90/geolookup/conditions/forecast/q/Australia/";

        Weather weather = new Weather();
        Gson gson = new Gson();

        logger.debug("This is the city name " + cityName);

//        System.out.println("This is the city name " + cityName);

        RestTemplate restTemplate = new RestTemplate();

        logger.debug("THE ORIGINAL URI ==> " + endPoint);
        endPoint += cityName + ".json";
        logger.debug("THE URI ==> " + endPoint);

        weather = gson.fromJson(restTemplate.getForObject(endPoint, String.class), Weather.class);

        return weather;
    }
}
