package com.java.animalkingdom;

public class Dog extends Mammal implements Predator, Carnivore, Scavenger{

	@Override
	public void eat(Object carrion, boolean tooOld) {
		if(tooOld){
			System.out.println("Don't eat too much");
		}else{
			System.out.println("Eat much of the time");
		}
		
	}

	@Override
	public void eat(Object freshMeat) {
		System.out.println("Eat fresh meat and whatever");
		
	}

	@Override
	public void hunt() {
		System.out.println("Go hunting for animals");
		
	}

	@Override
	void speak() {
		System.out.println("The dog says, \'B-A-R-K\'");
	}

}
