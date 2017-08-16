
package com.azlan.weatherApp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Low implements Serializable
{

    @SerializedName("fahrenheit")
    @Expose
    private String fahrenheit;
    @SerializedName("celsius")
    @Expose
    private String celsius;
    private final static long serialVersionUID = 1989363105328549273L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Low() {
    }

    /**
     * 
     * @param celsius
     * @param fahrenheit
     */
    public Low(String fahrenheit, String celsius) {
        super();
        this.fahrenheit = fahrenheit;
        this.celsius = celsius;
    }

    public String getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(String fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public String getCelsius() {
        return celsius;
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
