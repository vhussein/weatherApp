
package com.azlan.weatherApp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class QpfAllday implements Serializable
{

    @SerializedName("in")
    @Expose
    private Double in;
    @SerializedName("mm")
    @Expose
    private Double mm;
    private final static long serialVersionUID = 8352304613547717915L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public QpfAllday() {
    }

    /**
     * 
     * @param mm
     * @param in
     */
    public QpfAllday(Double in, Double mm) {
        super();
        this.in = in;
        this.mm = mm;
    }

    public Double getIn() {
        return in;
    }

    public void setIn(Double in) {
        this.in = in;
    }

    public Double getMm() {
        return mm;
    }

    public void setMm(Double mm) {
        this.mm = mm;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
