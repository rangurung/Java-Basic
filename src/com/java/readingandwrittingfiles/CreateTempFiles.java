package com.java.readingandwrittingfiles;

import java.io.File;

public class CreateTempFiles {

	public static void main(String[] args) {
		
		String tempDirectoryName = "C:" + File.separator + "file";
		File temDirectory = new File(tempDirectoryName);
		int counter = 0;
		for(int i=0; i<10; i++){
			try{
				File testFile = File.createTempFile("temp", null, temDirectory);
				/*testFile.deleteOnExit();
				System.out.println("temp files deleted " + i);*/
				counter++;
			}catch(Exception e){
				System.out.println("Couldn't create temp file "+ i);
			}
		}
		System.out.println(counter + " temp files created");
	}

}
