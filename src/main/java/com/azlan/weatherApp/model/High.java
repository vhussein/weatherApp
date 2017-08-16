
package com.azlan.weatherApp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class High implements Serializable
{

    @SerializedName("fahrenheit")
    @Expose
    private String fahrenheit;
    @SerializedName("celsius")
    @Expose
    private String celsius;
    private final static long serialVersionUID = 6758129656303339570L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public High() {
    }

    /**
     * 
     * @param celsius
     * @param fahrenheit
     */
    public High(String fahrenheit, String celsius) {
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
