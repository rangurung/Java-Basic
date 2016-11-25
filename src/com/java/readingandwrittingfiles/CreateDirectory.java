package com.java.readingandwrittingfiles;

import java.io.File;

public class CreateDirectory {

	public static void main(String[] args) {
		
		String testDirectoryName = "C:" + File.separator + "test1" + File.separator + "test2" +
									File.separator + "test3";
		
		File testDirectory = new File(testDirectoryName);
		try{
			testDirectory.mkdirs();
			System.out.println("Directories are created");
		}catch(Exception e){
			System.out.println("Couldn't create a directory called " +  testDirectoryName);
			System.exit(1);
		}
		
	}

}
