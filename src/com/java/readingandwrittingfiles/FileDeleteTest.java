package com.java.readingandwrittingfiles;

import java.io.File;
import java.io.IOException;

public class FileDeleteTest {

	public static void main(String[] args) throws IOException {
		String fileName = "C:" + File.separator + "file" + File.separator + "testFile.txt";
		File myFile = new File(fileName);
		
			if(!myFile.exists()){
				throw new IOException("Cannot delete " + fileName + " because " +
									fileName + "deos not exist");
			}else{
				myFile.delete();
				System.out.println(fileName+ " deleted");
			}
		
		System.out.println(fileName + " exists? " + myFile.exists());

	}

}
