package com.java.passbyvalue;

public class IntegerWrapperDemo {

	static int primitiveInt = 0;
	static IntegerWrapper intWrapper = new IntegerWrapper();
	
	public static void main(String[] args) {
		System.out.println("primitiveInt = " + primitiveInt++);
		passBy(primitiveInt, intWrapper);
		
		System.out.println("primitiveInt = " + primitiveInt +
							"; intWrapper.objectInt = " + intWrapper.objectInt);

	}
	
	public static int passBy(int primitiveInt, IntegerWrapper intWrapper){
		primitiveInt++;
		intWrapper.objectInt++;
		return primitiveInt;
	}

}
