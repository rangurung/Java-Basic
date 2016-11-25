package com.java.interfaceexamples;

public class CatDemo {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.speak();
		cat.sayWhatIAm();
		System.out.println(Cat.getNumberOfCats());

	}

}
