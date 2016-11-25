package com.java.basiccorejava;

public class AverageImpl implements Average{

	private long begin;
	private long end;
	private int[] ints;
	
	private static final String EXCEPTION_MESSAGE = "ints(array) must contain atleast one int.";
	
	public AverageImpl(int[] ints) throws IllegalArgumentException{
		if(ints.length == 0){
			throw new IllegalArgumentException(EXCEPTION_MESSAGE);
		}
		this.ints = ints;
	}
	
	public int[] getInts() {
	
		return ints;
	}

	public void setInt(int[] ints) throws IllegalArgumentException{
		if(ints.length == 0){
			throw new IllegalArgumentException(EXCEPTION_MESSAGE);
		}
		this.ints = ints;
	}

	public float getAverage() {
		begin = System.nanoTime();
		
		int total = 0;
		for(int i=0; i<ints.length; i++){
			total += ints[i];
		}
		end = System.nanoTime();
		return (float)total/ints.length;
	}

	public static float averageOfTwoNumbers(int a, int b){
		
		return (float) (a+b)/2;
	}
	
	public long getRuntime(){
		
		return end-begin;
	}
}
