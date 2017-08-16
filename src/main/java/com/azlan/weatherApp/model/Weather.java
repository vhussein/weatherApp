
package com.azlan.weatherApp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Weather implements Serializable
{

    @SerializedName("response")
    @Expose
    private Response response;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("current_observation")
    @Expose
    private CurrentObservation currentObservation;
    @SerializedName("forecast")
    @Expose
    private Forecast forecast;
    private final static long serialVersionUID = 9053250806981893437L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Weather() {
    }

    /**
     * 
     * @param currentObservation
     * @param response
     * @param forecast
     * @param location
     */
    public Weather(Response response, Location location, CurrentObservation currentObservation, Forecast forecast) {
        super();
        this.response = response;
        this.location = location;
        this.currentObservation = currentObservation;
        this.forecast = forecast;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public CurrentObservation getCurrentObservation() {
        return currentObservation;
    }

    public void setCurrentObservation(CurrentObservation currentObservation) {
        this.currentObservation = currentObservation;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
