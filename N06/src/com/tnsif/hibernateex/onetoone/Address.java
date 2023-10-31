//Program to define Address entity
package com.tnsif.hibernateex.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	private int addressId;

	private String city;
	private String state;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", state=" + state + "]";
	}

}
