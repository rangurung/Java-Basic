package com.java.controlflow;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements you want in array: ");
		n = input.nextInt();
		int [] numbers = new int[n];
		System.out.println("Enter all your array elements: ");
		
		for(int i=0; i<n; i++){
			numbers[i] = input.nextInt();
		}
		
		System.out.println("Array of Even numbers: ");
		for(int i=0; i<n; i++){
			if(numbers[i]%2 == 0){
				System.out.print(numbers[i]+ " ");
			}
		}
		System.out.println();
		System.out.println("Array of Odd numbers: ");
		for(int i=0; i<n; i++){
			if(numbers[i]%2 == 1){
				System.out.print(numbers[i] + " ");
			}
		}
		
	}

}
