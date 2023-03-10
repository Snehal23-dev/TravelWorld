package com.travelworld.weather.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.travelworld.weather.model.WeatherInfoRequest;

@Service
public class GeocodingImpl implements Geocoding {

	@Override
	public String getWeatherByLocationName(WeatherInfoRequest weatherInfoReq) {
		//currently not using limit parameter
		String uriPath = "http://api.openweathermap.org/geo/1.0/direct?q=" + weatherInfoReq.getLocationName() + "&appid=d2fe106b80709001b77b3459b84b47f1";
		// TODO Auto-generated method stub
		WebClient client = WebClient.create();
		WebClient.ResponseSpec responseSpec = client.get()
				.uri(uriPath)
				.retrieve();
		
		String res = responseSpec.bodyToMono(String.class).block(); 
		return res;
	}

	@Override
	public String getCoordByZipCode(WeatherInfoRequest weatherInfoReq) {
		String uriPath = "http://api.openweathermap.org/geo/1.0/zip?zip=" + weatherInfoReq.getZipCode() + "," + weatherInfoReq.getCountryCode() + "&appid=d2fe106b80709001b77b3459b84b47f1";
		// TODO Auto-generated method stub
		WebClient client = WebClient.create();
		WebClient.ResponseSpec responseSpec = client.get()
				.uri(uriPath)
				.retrieve();
				
		String res = responseSpec.bodyToMono(String.class).block(); 
		return res;
	}

}
