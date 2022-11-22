package com.jenkins.javabasics;

import java.security.KeyStore.PrivateKeyEntry;
import java.util.Scanner;
import java.util.StringJoiner;

public class AlexString {
	
	Scanner inputScanner = new Scanner(System.in);
	
	private String theString; 
	
	
	
	public void enterString(){

		System.out.println("Enter a String");
		
		theString = inputScanner.nextLine();
		
		int inValue = Integer.parseInt(theString);
		Integer valueOfInteger = Integer.valueOf(theString);
		
		
		System.out.println("Int value + 5 = "+inValue + 5);
		System.out.println("" + valueOfInteger);

	}
	
	public void buildStringBuffers() {
		
		StringBuffer str = new StringBuffer("Java Full Stack Developement");

		int len = str.length();
		System.out.println("Length of str " + len);
		int cap = str.capacity();
		System.out.println("Capacity is " + cap);
		
		str.append(" but python is easier");
		System.out.println(str);
		
	}

	public void buildStringJoiner() {
		
		StringJoiner joinName = new StringJoiner(",");
		
		joinName.add("Java");
		joinName.add("Python");
		joinName.add("C sharp");
		joinName.add("Java Script");
		joinName.add("Java");
		
		System.out.println(joinName);
	}

	public void usePrintMethod() {
		int i = 1234;
		byte b = 127;
		double d = 1.234;
		boolean bool = true; 
		System.out.printf("Integer format %d \n ", i);
		System.out.printf("double formatted to 2 decimal places %.2f \n", d);
		System.out.printf(" this a string: %s", "This is a string \n");
		
	}
}