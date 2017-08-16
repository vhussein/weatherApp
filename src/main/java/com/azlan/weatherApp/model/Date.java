
package com.azlan.weatherApp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Date implements Serializable
{

    @SerializedName("epoch")
    @Expose
    private String epoch;
    @SerializedName("pretty")
    @Expose
    private String pretty;
    @SerializedName("day")
    @Expose
    private Double day;
    @SerializedName("month")
    @Expose
    private Double month;
    @SerializedName("year")
    @Expose
    private Double year;
    @SerializedName("yday")
    @Expose
    private Double yday;
    @SerializedName("hour")
    @Expose
    private Double hour;
    @SerializedName("min")
    @Expose
    private String min;
    @SerializedName("sec")
    @Expose
    private Double sec;
    @SerializedName("isdst")
    @Expose
    private String isdst;
    @SerializedName("monthname")
    @Expose
    private String monthname;
    @SerializedName("monthname_short")
    @Expose
    private String monthnameShort;
    @SerializedName("weekday_short")
    @Expose
    private String weekdayShort;
    @SerializedName("weekday")
    @Expose
    private String weekday;
    @SerializedName("ampm")
    @Expose
    private String ampm;
    @SerializedName("tz_short")
    @Expose
    private String tzShort;
    @SerializedName("tz_long")
    @Expose
    private String tzLong;
    private final static long serialVersionUID = 5279094423940229530L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Date() {
    }

    /**
     * 
     * @param min
     * @param epoch
     * @param monthname
     * @param hour
     * @param pretty
     * @param monthnameShort
     * @param isdst
     * @param ampm
     * @param weekday
     * @param weekdayShort
     * @param yday
     * @param sec
     * @param tzLong
     * @param month
     * @param tzShort
     * @param year
     * @param day
     */
    public Date(String epoch, String pretty, Double day, Double month, Double year, Double yday, Double hour, String min, Double sec, String isdst, String monthname, String monthnameShort, String weekdayShort, String weekday, String ampm, String tzShort, String tzLong) {
        super();
        this.epoch = epoch;
        this.pretty = pretty;
        this.day = day;
        this.month = month;
        this.year = year;
        this.yday = yday;
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        this.isdst = isdst;
        this.monthname = monthname;
        this.monthnameShort = monthnameShort;
        this.weekdayShort = weekdayShort;
        this.weekday = weekday;
        this.ampm = ampm;
        this.tzShort = tzShort;
        this.tzLong = tzLong;
    }

    public String getEpoch() {
        return epoch;
    }

    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    public String getPretty() {
        return pretty;
    }

    public void setPretty(String pretty) {
        this.pretty = pretty;
    }

    public Double getDay() {
        return day;
    }

    public void setDay(Double day) {
        this.day = day;
    }

    public Double getMonth() {
        return month;
    }

    public void setMonth(Double month) {
        this.month = month;
    }

    public Double getYear() {
        return year;
    }

    public void setYear(Double year) {
        this.year = year;
    }

    public Double getYday() {
        return yday;
    }

    public void setYday(Double yday) {
        this.yday = yday;
    }

    public Double getHour() {
        return hour;
    }

    public void setHour(Double hour) {
        this.hour = hour;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public Double getSec() {
        return sec;
    }

    public void setSec(Double sec) {
        this.sec = sec;
    }

    public String getIsdst() {
        return isdst;
    }

    public void setIsdst(String isdst) {
        this.isdst = isdst;
    }

    public String getMonthname() {
        return monthname;
    }

    public void setMonthname(String monthname) {
        this.monthname = monthname;
    }

    public String getMonthnameShort() {
        return monthnameShort;
    }

    public void setMonthnameShort(String monthnameShort) {
        this.monthnameShort = monthnameShort;
    }

    public String getWeekdayShort() {
        return weekdayShort;
    }

    public void setWeekdayShort(String weekdayShort) {
        this.weekdayShort = weekdayShort;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getAmpm() {
        return ampm;
    }

    public void setAmpm(String ampm) {
        this.ampm = ampm;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
