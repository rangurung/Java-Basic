package com.java.controlflow;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class SwitchStatementExample {

	public static void main(String[] args) {
		
		GregorianCalendar cal = new GregorianCalendar();
		int day = cal.get(Calendar.DAY_OF_WEEK);
		String str = "Today is ";
		
		switch(day){
		case 1:
			str += "Sunday";
			break;
		case 2:
			str += "Monday";
			break;
		case 3:
			str += "Tuesday";
			break;
		case 4:
			str += "Wednesday";
			break;
		case 5:
			str += "Thursday";
			break;
		case 6:
			str += "Friday";
			break;
		default:
			str += "Saturday";
			break;
			
		}

		System.out.println(str);
	}

}
