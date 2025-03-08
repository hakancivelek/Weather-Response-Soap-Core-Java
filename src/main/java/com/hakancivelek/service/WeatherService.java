package com.hakancivelek.service;

import com.hakancivelek.dto.WeatherDTO;
import com.hakancivelek.exception.CityNotFoundException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://service.weather.soap.hakancivelek.com/",
        serviceName = "WeatherService",
        portName = "WeatherServicePort")
public class WeatherService {
    @WebMethod
    public WeatherDTO getWeather(@WebParam(name = "city") String city) throws CityNotFoundException {
        if ("Istanbul".equalsIgnoreCase(city)) {
            return new WeatherDTO(18, "Cloudy");
        } else if ("Ankara".equalsIgnoreCase(city)) {
            return new WeatherDTO(12, "Sunny");
        } else {
            throw new CityNotFoundException("City not found: " + city);
        }
    }
}
