package com.java.compasrisonobjects;

public class Student implements Comparable<Student>{

	String firstName;
	String lastName;
	String favoriteBook;
	
	public Student(String firstName, String lastName, String favoriteBook){
		this.firstName = firstName;
		this.lastName = lastName;
		this.favoriteBook = favoriteBook;
	}
	
	public boolean equals(Student s){
		if(s == null){
			return false;
		}
		if(s == this){
			return true;
		}
		if(!(s instanceof Student)){
			return false;
		}
		if(s.firstName.equals(this.firstName) && s.lastName.equals(this.lastName)){
			return true;
		}
		return false;
	}
	
	public int hashCode(){
		int result = 17;
		result *= firstName.hashCode() * 37;
		result *= lastName.hashCode() * 37;
		return result;
	}
	
	public int compareTo(Student s){
		//sort by last name first
		if(lastName.compareTo(s.lastName) > 0){
			return 1;
		}
		if(lastName.compareTo(s.lastName) < 0){
			return -1;
		}
		//last name must be equal to compare first name
		
		if(firstName.compareTo(s.firstName) > 0){
			return 1;
		}
		if(firstName.compareTo(s.firstName) < 0){
			return -1;
		}
		return 0; //both name must be equal
	}
}
