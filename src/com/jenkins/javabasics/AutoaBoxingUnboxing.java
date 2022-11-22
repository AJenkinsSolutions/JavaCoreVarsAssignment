package com.jenkins.javabasics;

import java.sql.ResultSet;

public class AutoaBoxingUnboxing {
	public static long smallestDivisor(long n) {
		// if divisible by 2
		if (n % 2 == 0)
			return 2;

		// iterate from 3 to sqrt(n)
		for (long i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return i;
		}

		return n;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/**
		 * Converting a primitive to its corresponding Wrapper class
		 */
		int a = 20; 
		Integer convertIntoInteger = a; 
		
		byte b = 100;
		Byte bb = b;
		System.out.println(bb.byteValue());
		System.out.println(smallestDivisor(523619));
		 
	}
}

