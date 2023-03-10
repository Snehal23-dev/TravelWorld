package com.travelworld.weather.service;

import com.travelworld.weather.model.WeatherInfoRequest;

public interface Geocoding {
	public String getWeatherByLocationName(WeatherInfoRequest weatherInfoReq);
	
	public String getCoordByZipCode(WeatherInfoRequest weatherInfoReq);
}
