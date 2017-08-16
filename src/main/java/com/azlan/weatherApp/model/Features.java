
package com.azlan.weatherApp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Features implements Serializable
{

    @SerializedName("geolookup")
    @Expose
    private Double geolookup;
    @SerializedName("conditions")
    @Expose
    private Double conditions;
    @SerializedName("forecast")
    @Expose
    private Double forecast;
    private final static long serialVersionUID = -4256105708043253818L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Features() {
    }

    /**
     * 
     * @param conditions
     * @param geolookup
     * @param forecast
     */
    public Features(Double geolookup, Double conditions, Double forecast) {
        super();
        this.geolookup = geolookup;
        this.conditions = conditions;
        this.forecast = forecast;
    }

    public Double getGeolookup() {
        return geolookup;
    }

    public void setGeolookup(Double geolookup) {
        this.geolookup = geolookup;
    }

    public Double getConditions() {
        return conditions;
    }

    public void setConditions(Double conditions) {
        this.conditions = conditions;
    }

    public Double getForecast() {
        return forecast;
    }

    public void setForecast(Double forecast) {
        this.forecast = forecast;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
