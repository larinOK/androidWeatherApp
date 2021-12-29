package com.example.weatherapp;

public class WeatherRVModel {
    private String time;
    private String temperature;
    private String iconURL;
    private String windspeed;

    public WeatherRVModel(String time, String temperature, String iconURL, String windspeed) {
        this.time = time;
        this.temperature = temperature;
        this.iconURL = iconURL;
        this.windspeed = windspeed;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getIconURL() {
        return iconURL;
    }

    public void setIconURL(String iconURL) {
        this.iconURL = iconURL;
    }

    public String getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(String windspeed) {
        this.windspeed = windspeed;
    }
}
