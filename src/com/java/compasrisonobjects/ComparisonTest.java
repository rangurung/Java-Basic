package com.java.compasrisonobjects;

public class ComparisonTest {

	public static void main(String[] args) {
		
		Object a = new Object();
		Object b = new Object();
		Object c = b;
		
		System.out.println(a == b);// a and b refers to different memory address
		System.out.println(b == c);// b and c refers to same memory address

	}

}
