package com.java.animalkingdom;

public class Cat extends Mammal implements Predator, Carnivore{

	private static int numberOfCats;
	
	Cat(){
		numberOfCats++;
	}
	
	public static final int getNumberOfCats(){
		return numberOfCats;
	}
	
	protected void sayWhatIAm(){
		System.out.println("I am a cat");
		super.sayWhatIAm();
	}
	@Override
	public void eat(Object freshMeat) {
		System.out.println("Eat fresh meat");
		
	}

	@Override
	public void hunt() {
		System.out.println("Go hunting for mice.");
		
	}

	@Override
	void speak() {
		System.out.println("The cat says, \'M-E-O-W\'");
		
	}

}
