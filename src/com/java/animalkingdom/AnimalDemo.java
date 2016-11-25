package com.java.animalkingdom;

public class AnimalDemo {

	public static void main(String[] args) {
		System.out.println("Cat: ");
		Cat cat = new Cat();
		cat.speak();
		cat.eat("Bird Meat");
		cat.hunt();
		cat.sayWhatIAm();
		
		System.out.println("Dog: ");
		Dog dog = new Dog();
		dog.speak();
		dog.sayWhatIAm();
		dog.eat("Flesh Meat");
		dog.eat("30", true);
		
		System.out.println("Mouse: ");
		Mouse mouse = new Mouse();
		mouse.speak();
		mouse.sayWhatIAm();
		mouse.eat("Green grass");

	}

}
