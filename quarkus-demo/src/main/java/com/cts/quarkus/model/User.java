package com.cts.quarkus.model;

public class User {

	private String name;
	private String email;
	private int birthYear;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public User(String name, String email, int birthYear) {
		super();
		this.name = name;
		this.email = email;
		this.birthYear = birthYear;
	}
	
	
	
}
