package com.java.enumexample;

public enum Direction {

	NORTH(0),
	EAST(90),
	SOUTH(180),
	WEST(270);
	
	private final int degrees;
	
	Direction(int degrees){
		this.degrees = degrees;
	}
	
	public int getDegrees(){
		return degrees;
	}
	
	public static Direction findCardinalDirection(int degrees){
		if(degrees < 45){
			return NORTH;
		}else if(degrees < 135){
			return EAST;
		}else if(degrees < 225){
			return SOUTH;
		}else if(degrees < 315){
			return WEST;
		}else{
			return NORTH;
		}
	}
	
}
