package com.azlan.weatherApp.service;

import com.azlan.weatherApp.model.Weather;

public interface WeatherService {

    public Weather getWeather(String cityName);
}
