
package com.azlan.weatherApp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Forecastday implements Serializable
{

    @SerializedName("period")
    @Expose
    private Double period;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("icon_url")
    @Expose
    private String iconUrl;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("fcttext")
    @Expose
    private String fcttext;
    @SerializedName("fcttext_metric")
    @Expose
    private String fcttextMetric;
    @SerializedName("pop")
    @Expose
    private String pop;
    private final static long serialVersionUID = 2014138939502886931L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Forecastday() {
    }

    /**
     * 
     * @param fcttextMetric
     * @param icon
     * @param title
     * @param iconUrl
     * @param fcttext
     * @param pop
     * @param period
     */
    public Forecastday(Double period, String icon, String iconUrl, String title, String fcttext, String fcttextMetric, String pop) {
        super();
        this.period = period;
        this.icon = icon;
        this.iconUrl = iconUrl;
        this.title = title;
        this.fcttext = fcttext;
        this.fcttextMetric = fcttextMetric;
        this.pop = pop;
    }

    public Double getPeriod() {
        return period;
    }

    public void setPeriod(Double period) {
        this.period = period;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFcttext() {
        return fcttext;
    }

    public void setFcttext(String fcttext) {
        this.fcttext = fcttext;
    }

    public String getFcttextMetric() {
        return fcttextMetric;
    }

    public void setFcttextMetric(String fcttextMetric) {
        this.fcttextMetric = fcttextMetric;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
