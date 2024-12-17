package com.example.demo.model;

public class User {

	private int id;
	private Address address;
	private Company company;

	public Company getCompany() {
		return company;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
