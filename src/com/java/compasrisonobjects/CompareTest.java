package com.java.compasrisonobjects;

public class CompareTest {

	public static void main(String[] args) {
		Person ranGurung = new Person("Ran", "Gurung");
		Person greatFighter = new Person("Ran", "Gurung");
		
		//Compare the reference to the memory address of two objects
		System.out.println(ranGurung == greatFighter);
		//Compare the relevant fields of two objects
		System.out.println(ranGurung.equals(greatFighter));
		
		System.out.println(ranGurung.compareTo(greatFighter));

	}

}
