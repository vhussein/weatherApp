
package com.azlan.weatherApp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Station_ implements Serializable
{

    @SerializedName("neighborhood")
    @Expose
    private String neighborhood;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lon")
    @Expose
    private Double lon;
    @SerializedName("distance_km")
    @Expose
    private Double distanceKm;
    @SerializedName("distance_mi")
    @Expose
    private Double distanceMi;
    private final static long serialVersionUID = 8604761144961983411L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Station_() {
    }

    /**
     * 
     * @param id
     * @param lon
     * @param state
     * @param neighborhood
     * @param distanceMi
     * @param lat
     * @param distanceKm
     * @param country
     * @param city
     */
    public Station_(String neighborhood, String city, String state, String country, String id, Double lat, Double lon, Double distanceKm, Double distanceMi) {
        super();
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.country = country;
        this.id = id;
        this.lat = lat;
        this.lon = lon;
        this.distanceKm = distanceKm;
        this.distanceMi = distanceMi;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getDistanceKm() {
        return distanceKm;
    }

    public void setDistanceKm(Double distanceKm) {
        this.distanceKm = distanceKm;
    }

    public Double getDistanceMi() {
        return distanceMi;
    }

    public void setDistanceMi(Double distanceMi) {
        this.distanceMi = distanceMi;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
