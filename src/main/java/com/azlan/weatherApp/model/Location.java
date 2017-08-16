
package com.azlan.weatherApp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Location implements Serializable
{

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("country_iso3166")
    @Expose
    private String countryIso3166;
    @SerializedName("country_name")
    @Expose
    private String countryName;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("tz_short")
    @Expose
    private String tzShort;
    @SerializedName("tz_long")
    @Expose
    private String tzLong;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lon")
    @Expose
    private String lon;
    @SerializedName("zip")
    @Expose
    private String zip;
    @SerializedName("magic")
    @Expose
    private String magic;
    @SerializedName("wmo")
    @Expose
    private String wmo;
    @SerializedName("l")
    @Expose
    private String l;
    @SerializedName("requesturl")
    @Expose
    private String requesturl;
    @SerializedName("wuiurl")
    @Expose
    private String wuiurl;
    @SerializedName("nearby_weather_stations")
    @Expose
    private NearbyWeatherStations nearbyWeatherStations;
    private final static long serialVersionUID = -2016188437624341132L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Location() {
    }

    /**
     * 
     * @param zip
     * @param countryName
     * @param lon
     * @param countryIso3166
     * @param state
     * @param l
     * @param type
     * @param country
     * @param city
     * @param magic
     * @param nearbyWeatherStations
     * @param tzLong
     * @param requesturl
     * @param wmo
     * @param tzShort
     * @param wuiurl
     * @param lat
     */
    public Location(String type, String country, String countryIso3166, String countryName, String state, String city, String tzShort, String tzLong, String lat, String lon, String zip, String magic, String wmo, String l, String requesturl, String wuiurl, NearbyWeatherStations nearbyWeatherStations) {
        super();
        this.type = type;
        this.country = country;
        this.countryIso3166 = countryIso3166;
        this.countryName = countryName;
        this.state = state;
        this.city = city;
        this.tzShort = tzShort;
        this.tzLong = tzLong;
        this.lat = lat;
        this.lon = lon;
        this.zip = zip;
        this.magic = magic;
        this.wmo = wmo;
        this.l = l;
        this.requesturl = requesturl;
        this.wuiurl = wuiurl;
        this.nearbyWeatherStations = nearbyWeatherStations;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryIso3166() {
        return countryIso3166;
    }

    public void setCountryIso3166(String countryIso3166) {
        this.countryIso3166 = countryIso3166;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTzShort() {
        return tzShort;
    }

    public void setTzShort(String tzShort) {
        this.tzShort = tzShort;
    }

    public String getTzLong() {
        return tzLong;
    }

    public void setTzLong(String tzLong) {
        this.tzLong = tzLong;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getMagic() {
        return magic;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }

    public String getWmo() {
        return wmo;
    }

    public void setWmo(String wmo) {
        this.wmo = wmo;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getRequesturl() {
        return requesturl;
    }

    public void setRequesturl(String requesturl) {
        this.requesturl = requesturl;
    }

    public String getWuiurl() {
        return wuiurl;
    }

    public void setWuiurl(String wuiurl) {
        this.wuiurl = wuiurl;
    }

    public NearbyWeatherStations getNearbyWeatherStations() {
        return nearbyWeatherStations;
    }

    public void setNearbyWeatherStations(NearbyWeatherStations nearbyWeatherStations) {
        this.nearbyWeatherStations = nearbyWeatherStations;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
