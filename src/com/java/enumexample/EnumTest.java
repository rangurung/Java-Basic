package com.java.enumexample;

public class EnumTest {

	public static void main(String[] args) {
		
		int[] compassPoints = {27, 86, 144, 290};
		for(int i=0; i<compassPoints.length; i++){
			System.out.println(compassPoints[i] + " degrees is (close to) " +
					Direction.findCardinalDirection(compassPoints[i]));
		}
		System.out.println();
		for(Direction direction : Direction.values()){
			System.out.println(direction + " is " + direction.getDegrees() + " degrees");
		}
		
		int a = 0;
		++a;
		
		System.out.println(a--);
		System.out.println(++a);
	}

}
