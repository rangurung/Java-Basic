package com.java.basiccorejava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AverageTest {

	public static void main(String[] args) {
		
		int[] ints = {1,2,3,4,5,6};
		AverageImpl averageImpl = new AverageImpl(ints);
		
		 System.out.println("First Test*************");
		 String testString = buildTestString(averageImpl.getInts(), averageImpl.getAverage(),
				 averageImpl.getRuntime());
		 System.out.println(testString);
		 
		 System.out.println("Second Test******************");
		 ints[0] = 2;
		 ints[1] = 3;
		 ints[2] = 4;
		 ints[3] = 5;
		 ints[4] = 9;
		 
		 averageImpl.setInt(ints);
		 testString = buildTestString(averageImpl.getInts(), averageImpl.getAverage(), 
				 averageImpl.getRuntime());
		 System.out.println(testString);
		 
		 System.out.println("Exception Test**************");
		 int[] ints2 = {};
		 try{
			 averageImpl.setInt(ints2);
		 }catch(IllegalArgumentException iae){
			 System.out.println("Oops! can't use an empty array.");
		 }
		 //Test for convenience method
		 System.out.println("AverageImpl.averageOfTwoNumbers(2,3) = "
				+ AverageImpl.averageOfTwoNumbers(2, 3) );
		 
		 
		int intValue = 25;
		String stringValue = Integer.toString(intValue);
		System.out.println("Int value to String value " + "\"" + stringValue + "\"");
		
		String strValue = "676736";
		int intValue1 = Integer.parseInt(strValue);
		System.out.println("String value to int value "+ intValue1);
	}
	//Build testString.......
	private static String buildTestString(int[] values, float average,
			long runtime) {
		Date now = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		String timeStamp = formatter.format(now);
		
		StringBuffer sb = new StringBuffer(timeStamp);
		sb.append(" => Average of {");
		for(int i=0; i<values.length; i++){
			sb.append(values[i]);
			if(i < values.length-1){
				sb.append(",");
			}
		}
		sb.append("} is ");
		sb.append(average);
		sb.append(" got in ");
		sb.append(runtime);
		sb.append(" nanoseconds.");
		
		return sb.toString();
	}
}
