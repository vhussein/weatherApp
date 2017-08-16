
package com.azlan.weatherApp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Forecast implements Serializable
{

    @SerializedName("txt_forecast")
    @Expose
    private TxtForecast txtForecast;
    @SerializedName("simpleforecast")
    @Expose
    private Simpleforecast simpleforecast;
    private final static long serialVersionUID = 8580956436159440103L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Forecast() {
    }

    /**
     * 
     * @param simpleforecast
     * @param txtForecast
     */
    public Forecast(TxtForecast txtForecast, Simpleforecast simpleforecast) {
        super();
        this.txtForecast = txtForecast;
        this.simpleforecast = simpleforecast;
    }

    public TxtForecast getTxtForecast() {
        return txtForecast;
    }

    public void setTxtForecast(TxtForecast txtForecast) {
        this.txtForecast = txtForecast;
    }

    public Simpleforecast getSimpleforecast() {
        return simpleforecast;
    }

    public void setSimpleforecast(Simpleforecast simpleforecast) {
        this.simpleforecast = simpleforecast;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
