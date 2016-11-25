package com.java.arrays;

import java.util.Arrays;

public class BasicArray {

	public static void main(String[] args) {
		int a[] = {0, 1, 2, 3, 4, 5, 6};
		
		a[0] = 7;
		a[5] = 9;
		/*for(int i=0; i<a.length; i++){
				if(i==0){
					System.out.print("[" + a[i]);
				}
				else if(i==a.length-1){
					System.out.print("," + a[i] +"]");
				}
				else{
					System.out.print("," + a[i]);
				}
			}*/
		System.out.print("[");
		for(int i=0; i<a.length; i++){
			Arrays.sort(a);
			System.out.print(" " + a[i]);
		}
		System.out.print("]\n"); 
		
		
		Integer[] myInteger = new Integer[5];
		for(int i=0; i<myInteger.length; i++){
			myInteger[i] = new Integer(i);
			System.out.print(myInteger[i]+ " ");
		}
		
	}
}


