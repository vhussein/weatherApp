
package com.azlan.weatherApp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class Airport implements Serializable
{

    @SerializedName("station")
    @Expose
    private List<Station> station = null;
    private final static long serialVersionUID = -6146951967863583263L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Airport() {
    }

    /**
     * 
     * @param station
     */
    public Airport(List<Station> station) {
        super();
        this.station = station;
    }

    public List<Station> getStation() {
        return station;
    }

    public void setStation(List<Station> station) {
        this.station = station;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
