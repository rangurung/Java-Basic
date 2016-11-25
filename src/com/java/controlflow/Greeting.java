package com.java.controlflow;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		String firstName;
		String lastName;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your firstname?");
		firstName = input.nextLine();
		System.out.println("Enter your lastname?");
		lastName = input.nextLine();
		
		GregorianCalendar cal = new GregorianCalendar();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		String greeting = "Good ";
		
		if(hour < 12){
			greeting += "Morning " + firstName +" " + lastName;
		}
		else if(hour < 18){
			greeting += "Afternoon " + firstName +" " + lastName;
		}else{
			greeting += "Evening " + firstName +" " + lastName;
		}
		System.out.println(greeting);
	}

}
