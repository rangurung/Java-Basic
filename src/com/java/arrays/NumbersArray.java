package com.java.arrays;

public class NumbersArray {

	public static void main(String[] args) {
		
		int [] numbers = {5, 10, 20, 35, 40, 50, 65, 70, 85, 90, 100};
		int even = 0;
		int odd = 0;
		for(int i=0; i<numbers.length; i++){
			if(numbers[i]%2 == 0){
				System.out.println("Even numbers: " + numbers[i]);
				even++;
			}else{
				System.out.println("Odd numbers: " + numbers[i]);
				odd++;
			}
		}
		System.out.println("Even numbers: " + even);
		System.out.println("Odd numbers: "+ odd);

	}

}
