package com.java.interfaceexamples;

public class Cat extends Mammal{

	private static int numberOfCats;
	Cat(){
		numberOfCats++;
	}
	//not allow the child class to implement getNumberOfCats method 
	public static final int getNumberOfCats(){
		return numberOfCats;
	}

	@Override
	void speak() {
		System.out.println("M-E-O-W");
		
	}
	
	protected void sayWhatIAm(){
		System.out.println("I am a cat");
		super.sayWhatIAm();
	}

}
