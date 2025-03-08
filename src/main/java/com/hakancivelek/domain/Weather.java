package com.hakancivelek.domain;

public class Weather {
    public Weather(String city, int temperature, String condition) {
        this.city = city;
        this.temperature = temperature;
        this.condition = condition;
    }

    private String city;
    private int temperature;
    private String condition;
}
