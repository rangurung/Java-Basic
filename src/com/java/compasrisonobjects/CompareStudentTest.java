package com.java.compasrisonobjects;

import java.util.ArrayList;
import java.util.Collections;

public class CompareStudentTest {

	public static void main(String[] args) {
		
		Student ranGurung = new Student("Ran", "Gurung", "\'Big Bang\'");
		Student rojanGurung = new Student("Rojan", "Gurung", "\'Little Bunny\'");
		Student saritaGiri = new Student("Sarita", "Giri", "\'Hello Beauty\'");
		Student drGurung = new Student("Rojan", "Gurung", "\'Little Bunny\'");
		Student sarinaGrg = new Student("Sarina", "Grg", "\'Journey to the Space\'");
		Student samSpade = new Student("Sam", "Spade", "\'A Study in Scarlet\'");
		
		//Compare rojanGurung and drGurung that are really equal
		System.out.println(rojanGurung == drGurung);
		System.out.println(rojanGurung.equals(drGurung));
		System.out.println();
		
		//Make a Collection of students to sort them
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(ranGurung);
		students.add(rojanGurung);
		students.add(saritaGiri);
		students.add(drGurung);
		students.add(sarinaGrg);
		students.add(samSpade);
		
		//Sort them by natural values(use compareTo())
		System.out.println("Sorting by name: ");
		Collections.sort(students);
		for(int i=0; i<students.size(); i++){
			Student student = students.get(i);
			System.out.println(student.firstName + " " + student.lastName + " likes " +
								student.favoriteBook);
		}
		System.out.println();
		System.out.println("Sorting by favorite book: ");
		//sorting by book uses Comparator
		Collections.sort(students, new BookComparator());
		for(int i=0; i<students.size(); i++){
			Student student = students.get(i);
			System.out.println(student.firstName + " " + student.lastName +
								" likes " + student.favoriteBook);
		}
	}

}
