
package com.azlan.weatherApp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class Simpleforecast implements Serializable
{

    @SerializedName("forecastday")
    @Expose
    private List<Forecastday_> forecastday = null;
    private final static long serialVersionUID = -2213497213550130474L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Simpleforecast() {
    }

    /**
     * 
     * @param forecastday
     */
    public Simpleforecast(List<Forecastday_> forecastday) {
        super();
        this.forecastday = forecastday;
    }

    public List<Forecastday_> getForecastday() {
        return forecastday;
    }

    public void setForecastday(List<Forecastday_> forecastday) {
        this.forecastday = forecastday;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
