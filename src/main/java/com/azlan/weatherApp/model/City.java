package com.azlan.weatherApp.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class City {

    private static final Logger logger = LoggerFactory.getLogger(City.class);

    @Value("${weatherApp.country}")
    private String[] country;

    @Value("${weatherApp.city}")
    private String[] city;

    public City() {

        logger.debug("DEFAULT CITY CONSTRUCTOR");
    }

    public City(String[] country, String[] city) {
        this.country = country;
        this.city = city;
    }

    public String[] getCountry() {
        return country;
    }

    public void setCountry(String[] country) {
        this.country = country;
    }

    public String[] getCity() {
        return city;
    }

    public void setCity(String[] city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "City{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
