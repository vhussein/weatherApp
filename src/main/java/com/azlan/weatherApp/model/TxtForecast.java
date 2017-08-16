
package com.azlan.weatherApp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class TxtForecast implements Serializable
{

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("forecastday")
    @Expose
    private List<Forecastday> forecastday = null;
    private final static long serialVersionUID = 320095305352826424L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TxtForecast() {
    }

    /**
     * 
     * @param forecastday
     * @param date
     */
    public TxtForecast(String date, List<Forecastday> forecastday) {
        super();
        this.date = date;
        this.forecastday = forecastday;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Forecastday> getForecastday() {
        return forecastday;
    }

    public void setForecastday(List<Forecastday> forecastday) {
        this.forecastday = forecastday;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
