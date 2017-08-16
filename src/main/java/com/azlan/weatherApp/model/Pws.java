
package com.azlan.weatherApp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class Pws implements Serializable
{

    @SerializedName("station")
    @Expose
    private List<Station_> station = null;
    private final static long serialVersionUID = 4050530778294310543L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pws() {
    }

    /**
     * 
     * @param station
     */
    public Pws(List<Station_> station) {
        super();
        this.station = station;
    }

    public List<Station_> getStation() {
        return station;
    }

    public void setStation(List<Station_> station) {
        this.station = station;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
