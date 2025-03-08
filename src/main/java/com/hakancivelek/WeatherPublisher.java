package com.hakancivelek;

import com.hakancivelek.service.WeatherService;

import javax.xml.ws.Endpoint;

public class WeatherPublisher {
    public static void main(String[] args) {
        String url = "http://localhost:8080/ws/weather";
        System.out.println("Weather Service is being published at " + url);
        Endpoint.publish(url, new WeatherService());
    }
}
