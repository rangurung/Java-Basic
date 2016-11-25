package com.java.controlflow;

public class Continue_With_Label {

	public static void main(String[] args) {
		
		String [] students = {"Rojan", "Ran", "Sarita Giri", "Sarina Gurung"};
		int charBeforeSpaces = 0;
		
		label:
			for(String str : students){
				char[] strChars = str.toCharArray();
				for(char ch : strChars){
					if(ch == ' '){
						continue label;//same result with replacing it by break
					}
					charBeforeSpaces++;
				}
			}
		System.out.println(charBeforeSpaces);	
	}

}
