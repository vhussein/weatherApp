
package com.azlan.weatherApp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class NearbyWeatherStations implements Serializable
{

    @SerializedName("airport")
    @Expose
    private Airport airport;
    @SerializedName("pws")
    @Expose
    private Pws pws;
    private final static long serialVersionUID = 8680840591070157301L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NearbyWeatherStations() {
    }

    /**
     * 
     * @param airport
     * @param pws
     */
    public NearbyWeatherStations(Airport airport, Pws pws) {
        super();
        this.airport = airport;
        this.pws = pws;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public Pws getPws() {
        return pws;
    }

    public void setPws(Pws pws) {
        this.pws = pws;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
