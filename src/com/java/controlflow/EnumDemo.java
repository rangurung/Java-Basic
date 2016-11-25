package com.java.controlflow;

import com.java.enumexample.Direction;


public class EnumDemo {

	public static void main(String[] args) {
		
		int [] compassPoints = {22, 77, 144, 288};
		int i=0;
		while(i < compassPoints.length){
			System.out.println(compassPoints[i] + " degrees is (approx) "+ 
					Direction.findCardinalDirection(compassPoints[i]));
			i++;
		}
	}

}
