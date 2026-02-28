package com.jsp.spring.SpringProject_DependecnyEnjection;

public class Address {
	private String addressLocation;
	private String addressCity;

	public Address() {

	}

	public Address(String addressLocation, String addressCity) {
		//super();
		this.addressLocation=addressLocation;
		this.addressCity=addressCity;
	}

	public String getAddressLocation() {
		return addressLocation;
	}

	public void setAddressLocation(String addressLocation) {
		this.addressLocation = addressLocation;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	@Override
	public String toString() {
		return "Address [addressLocation=" + addressLocation + ", addressCity=" + addressCity + "]";
	}
}
