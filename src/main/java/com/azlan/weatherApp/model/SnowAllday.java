
package com.azlan.weatherApp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class SnowAllday implements Serializable
{

    @SerializedName("in")
    @Expose
    private Double in;
    @SerializedName("cm")
    @Expose
    private Double cm;
    private final static long serialVersionUID = -573197400038006647L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SnowAllday() {
    }

    /**
     * 
     * @param cm
     * @param in
     */
    public SnowAllday(Double in, Double cm) {
        super();
        this.in = in;
        this.cm = cm;
    }

    public Double getIn() {
        return in;
    }

    public void setIn(Double in) {
        this.in = in;
    }

    public Double getCm() {
        return cm;
    }

    public void setCm(Double cm) {
        this.cm = cm;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
