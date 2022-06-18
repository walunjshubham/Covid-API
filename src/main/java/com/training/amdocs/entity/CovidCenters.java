package com.training.amdocs.entity;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table
public class CovidCenters{
	
	@Id
	private String name;
	private String address;
	private int pinCode;
	public CovidCenters() {

	}

	public CovidCenters(String name,String address,int pinCode) {
		this.name=name;
		this.address=address;
		this.pinCode=pinCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}



}
