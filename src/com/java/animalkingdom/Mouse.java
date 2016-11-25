package com.java.animalkingdom;

public class Mouse extends Mammal implements Herbivore{

	@Override
	public void eat(Object greenPlants) {
		System.out.println("Eat green plants and grasses");
		
	}

	@Override
	void speak() {
		System.out.println("The mouse says, \'S-Q-U-E-A-K\'");
		
	}

}
