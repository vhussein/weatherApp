
package com.azlan.weatherApp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Avewind implements Serializable
{

    @SerializedName("mph")
    @Expose
    private Double mph;
    @SerializedName("kph")
    @Expose
    private Double kph;
    @SerializedName("dir")
    @Expose
    private String dir;
    @SerializedName("degrees")
    @Expose
    private Double degrees;
    private final static long serialVersionUID = -8523967188016332041L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Avewind() {
    }

    /**
     * 
     * @param mph
     * @param dir
     * @param degrees
     * @param kph
     */
    public Avewind(Double mph, Double kph, String dir, Double degrees) {
        super();
        this.mph = mph;
        this.kph = kph;
        this.dir = dir;
        this.degrees = degrees;
    }

    public Double getMph() {
        return mph;
    }

    public void setMph(Double mph) {
        this.mph = mph;
    }

    public Double getKph() {
        return kph;
    }

    public void setKph(Double kph) {
        this.kph = kph;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public Double getDegrees() {
        return degrees;
    }

    public void setDegrees(Double degrees) {
        this.degrees = degrees;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
