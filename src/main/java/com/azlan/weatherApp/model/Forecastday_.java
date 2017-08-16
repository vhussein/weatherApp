
package com.azlan.weatherApp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Forecastday_ implements Serializable
{

    @SerializedName("date")
    @Expose
    private Date date;
    @SerializedName("period")
    @Expose
    private Double period;
    @SerializedName("high")
    @Expose
    private High high;
    @SerializedName("low")
    @Expose
    private Low low;
    @SerializedName("conditions")
    @Expose
    private String conditions;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("icon_url")
    @Expose
    private String iconUrl;
    @SerializedName("skyicon")
    @Expose
    private String skyicon;
    @SerializedName("pop")
    @Expose
    private Double pop;
    @SerializedName("qpf_allday")
    @Expose
    private QpfAllday qpfAllday;
    @SerializedName("qpf_day")
    @Expose
    private QpfDay qpfDay;
    @SerializedName("qpf_night")
    @Expose
    private QpfNight qpfNight;
    @SerializedName("snow_allday")
    @Expose
    private SnowAllday snowAllday;
    @SerializedName("snow_day")
    @Expose
    private SnowDay snowDay;
    @SerializedName("snow_night")
    @Expose
    private SnowNight snowNight;
    @SerializedName("maxwind")
    @Expose
    private Maxwind maxwind;
    @SerializedName("avewind")
    @Expose
    private Avewind avewind;
    @SerializedName("avehumidity")
    @Expose
    private Double avehumidity;
    @SerializedName("maxhumidity")
    @Expose
    private Double maxhumidity;
    @SerializedName("minhumidity")
    @Expose
    private Double minhumidity;
    private final static long serialVersionUID = -6652411474755119661L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Forecastday_() {
    }

    /**
     * 
     * @param icon
     * @param maxwind
     * @param qpfDay
     * @param qpfAllday
     * @param iconUrl
     * @param skyicon
     * @param pop
     * @param date
     * @param period
     * @param snowDay
     * @param conditions
     * @param snowAllday
     * @param avewind
     * @param avehumidity
     * @param qpfNight
     * @param minhumidity
     * @param high
     * @param low
     * @param maxhumidity
     * @param snowNight
     */
    public Forecastday_(Date date, Double period, High high, Low low, String conditions, String icon, String iconUrl, String skyicon, Double pop, QpfAllday qpfAllday, QpfDay qpfDay, QpfNight qpfNight, SnowAllday snowAllday, SnowDay snowDay, SnowNight snowNight, Maxwind maxwind, Avewind avewind, Double avehumidity, Double maxhumidity, Double minhumidity) {
        super();
        this.date = date;
        this.period = period;
        this.high = high;
        this.low = low;
        this.conditions = conditions;
        this.icon = icon;
        this.iconUrl = iconUrl;
        this.skyicon = skyicon;
        this.pop = pop;
        this.qpfAllday = qpfAllday;
        this.qpfDay = qpfDay;
        this.qpfNight = qpfNight;
        this.snowAllday = snowAllday;
        this.snowDay = snowDay;
        this.snowNight = snowNight;
        this.maxwind = maxwind;
        this.avewind = avewind;
        this.avehumidity = avehumidity;
        this.maxhumidity = maxhumidity;
        this.minhumidity = minhumidity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getPeriod() {
        return period;
    }

    public void setPeriod(Double period) {
        this.period = period;
    }

    public High getHigh() {
        return high;
    }

    public void setHigh(High high) {
        this.high = high;
    }

    public Low getLow() {
        return low;
    }

    public void setLow(Low low) {
        this.low = low;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
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

    public String getSkyicon() {
        return skyicon;
    }

    public void setSkyicon(String skyicon) {
        this.skyicon = skyicon;
    }

    public Double getPop() {
        return pop;
    }

    public void setPop(Double pop) {
        this.pop = pop;
    }

    public QpfAllday getQpfAllday() {
        return qpfAllday;
    }

    public void setQpfAllday(QpfAllday qpfAllday) {
        this.qpfAllday = qpfAllday;
    }

    public QpfDay getQpfDay() {
        return qpfDay;
    }

    public void setQpfDay(QpfDay qpfDay) {
        this.qpfDay = qpfDay;
    }

    public QpfNight getQpfNight() {
        return qpfNight;
    }

    public void setQpfNight(QpfNight qpfNight) {
        this.qpfNight = qpfNight;
    }

    public SnowAllday getSnowAllday() {
        return snowAllday;
    }

    public void setSnowAllday(SnowAllday snowAllday) {
        this.snowAllday = snowAllday;
    }

    public SnowDay getSnowDay() {
        return snowDay;
    }

    public void setSnowDay(SnowDay snowDay) {
        this.snowDay = snowDay;
    }

    public SnowNight getSnowNight() {
        return snowNight;
    }

    public void setSnowNight(SnowNight snowNight) {
        this.snowNight = snowNight;
    }

    public Maxwind getMaxwind() {
        return maxwind;
    }

    public void setMaxwind(Maxwind maxwind) {
        this.maxwind = maxwind;
    }

    public Avewind getAvewind() {
        return avewind;
    }

    public void setAvewind(Avewind avewind) {
        this.avewind = avewind;
    }

    public Double getAvehumidity() {
        return avehumidity;
    }

    public void setAvehumidity(Double avehumidity) {
        this.avehumidity = avehumidity;
    }

    public Double getMaxhumidity() {
        return maxhumidity;
    }

    public void setMaxhumidity(Double maxhumidity) {
        this.maxhumidity = maxhumidity;
    }

    public Double getMinhumidity() {
        return minhumidity;
    }

    public void setMinhumidity(Double minhumidity) {
        this.minhumidity = minhumidity;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
