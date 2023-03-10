package com.travelworld.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travelworld.weather.model.WeatherInfoRequest;
import com.travelworld.weather.service.GeocodingImpl;

@RestController
@RequestMapping("/weather-report")
public class WeatherController {

	@Autowired
	GeocodingImpl gecodingImpl;
	
	@GetMapping("/{locationName}")
	public ResponseEntity<String> getGeoWeather(@PathVariable String locationName) {
		WeatherInfoRequest weatherInfoReq = new WeatherInfoRequest(locationName);
		
		return new ResponseEntity<String>(gecodingImpl.getWeatherByLocationName(weatherInfoReq),HttpStatus.OK);
	}
	
	@GetMapping("/{countryCode}/{zipCode}")
	public ResponseEntity<String> getGeoWeather(@PathVariable String countryCode, @PathVariable String zipCode) {
		WeatherInfoRequest weatherInfoReq = new WeatherInfoRequest(countryCode,zipCode);
		
		return new ResponseEntity<String>(gecodingImpl.getCoordByZipCode(weatherInfoReq),HttpStatus.OK);
	}
	
}
