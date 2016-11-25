package com.java.readingandwrittingfiles;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		
		//String fileName = "C:\\file\\testFile.txt";
		//Good practice
		String fileName = "C:" + File.separator + "file" + File.separator + "testFile.txt";
		File myFile = new File(fileName);
		System.out.println(fileName + " exists? " + myFile.exists());
		try{
			myFile.createNewFile();
		}catch(Exception e){
			System.out.println("Couldn't create " + myFile.getPath());
		}
		System.out.println("File created " + myFile);
	}

}
