package com.azlan.weatherApp.service;

import com.azlan.weatherApp.model.City;
import org.apache.commons.lang.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("cityService")
public class cityServiceImpl implements cityService {

    private static final Logger logger = LoggerFactory.getLogger(cityServiceImpl.class);

    @Override
    public City getCity() {

        logger.debug("Getting the city details");

//        TODO: Need to get the details from the City object & pass as json

        return null;
    }
}
