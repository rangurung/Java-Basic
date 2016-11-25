package com.java.compasrisonobjects;

import java.util.Comparator;



public class BookComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.favoriteBook.compareTo(s2.favoriteBook);
	}

}
