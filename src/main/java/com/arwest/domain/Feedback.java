package com.arwest.domain;

import java.io.Serializable;

public class Feedback implements Serializable {
	
	private static final long serialVersionUID = 578607764864549788L;
	
	private String email;
	private String firstName;
	private String lastName;
	private String message;
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Feedback [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", message="
				+ message + "]";
	}
	
	

}
