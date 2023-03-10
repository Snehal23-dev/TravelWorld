package com.travelworld.weather.model;

public class WeatherInfoRequest {
	String locationName;
	String zipCode;
	String countryCode;
	
	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	@Override
	public String toString() {
		return "WeatherInfoRequest [locationName=" + locationName + ", zipCode=" + zipCode + ", countryCode="
				+ countryCode + "]";
	}

	public WeatherInfoRequest(String locationName) {
		super();
		this.locationName = locationName;
	}

	public WeatherInfoRequest(String countryCode, String zipCode) {
		super();
		this.zipCode = zipCode;
		this.countryCode = countryCode;
	}

	public WeatherInfoRequest() {
		super();
	}
	
	
}
