package com.java.readingandwrittingfiles;

import java.io.File;

public class DeleteDirectory {

	public static void main(String[] args) {
		
		String testDirectoryName = "C:" + File.separator + "test1";
		File testDirectory = new File(testDirectoryName);
		
		if(testDirectory.exists()){
			testDirectory.delete();
			System.out.println(testDirectoryName + " Directory deleted");
		}else{
			System.out.println("Couldn't delete " + testDirectory + " because it does not exist");
		}

	}

}
