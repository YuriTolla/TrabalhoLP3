package com.tolla.LP3Trabalho.com.tolla.LP3Trabalho.domain;

public class ClimaData {
    private Double temperature;
    private String wind_direction;
    private String wind_velocity;
    private Double humidity;
    private String condition;
    private Double pressure;
    private String icon;
    private int sensation;
    private String date;

    public ClimaData() {
    }

    public ClimaData(Double temperature, String wind_direction, String wind_velocity, Double humidity, String condition, Double pressure, String icon, int sensation, String date) {
        this.temperature = temperature;
        this.wind_direction = wind_direction;
        this.wind_velocity = wind_velocity;
        this.humidity = humidity;
        this.condition = condition;
        this.pressure = pressure;
        this.icon = icon;
        this.sensation = sensation;
        this.date = date;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public String getWind_direction() {
        return wind_direction;
    }

    public void setWind_direction(String wind_direction) {
        this.wind_direction = wind_direction;
    }

    public String getWind_velocity() {
        return wind_velocity;
    }

    public void setWind_velocity(String wind_velocity) {
        this.wind_velocity = wind_velocity;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getSensation() {
        return sensation;
    }

    public void setSensation(int sensation) {
        this.sensation = sensation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
