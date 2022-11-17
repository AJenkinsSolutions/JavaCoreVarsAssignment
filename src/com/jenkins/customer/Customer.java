package com.jenkins.customer;

import java.util.Scanner;

public class Customer {
	
	private String firstName;
	private String lastName;
	private String email;
	
	public Customer(String fName, String lName, String email) {
		this.firstName = fName;
		this.lastName = lName;
		this.email = email;
		
	}
	
	

	public Customer() {
		this.firstName = "";
		this.lastName = "";
		this.email = "";
		
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

	public void getUserInformation() {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter first name");
		String fname = input.next();
		setFirstName(fname);
		
		System.out.println("Enter last name");
		setLastName(input.next());
		
		System.out.println("Enter email");
		setEmail(input.next());
		
		input.close();
	}

	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}
	
	

	public void displayName() {
		System.out.println(getFirstName() + " \n" + getLastName() + " \n" + getEmail());
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	
	
}
