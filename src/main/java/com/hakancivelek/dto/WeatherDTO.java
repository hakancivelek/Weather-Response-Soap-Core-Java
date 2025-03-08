package com.hakancivelek.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WeatherDTO {
    private int temperature;
    private String condition;

    public WeatherDTO() {
    }

    public WeatherDTO(int temperature, String condition) {
        this.temperature = temperature;
        this.condition = condition;
    }

    // Getter ve Setter metodları
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}

