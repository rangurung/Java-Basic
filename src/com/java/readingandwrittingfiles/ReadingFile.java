package com.java.readingandwrittingfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args) {
		//Specify the file
		String fileName = "C:" +File.separator + "test1" + File.separator + "shakespeare.txt";
		File shakespeareFile = new File(fileName);
		//Set up byte array to hold the file's content
		byte [] content = new byte[0];
		
		try{
			//create input stream for file
			FileInputStream inputStream = new FileInputStream(shakespeareFile);
			//Figure out how much content the file has
			int bytesAvailable = inputStream.available();
			//set the content array to the length of the content
			content = new byte[bytesAvailable];
			//load the file's content into our byte array
			inputStream.read(content);
			//close the stream
			inputStream.close();
			
		}catch(FileNotFoundException fe){
			System.out.println("Couldn't find a file called " + fileName);
		}catch(IOException ie){
			System.out.println("Couldn'd read the from the file called " + fileName);
		}
		//convert our content to a string and write it to the console
		System.out.println(new String(content));
		
		//Writing file
		//Reverse the content of our array
		reverseByteArray(content);
		
		try{
			//Create output stream for file
			FileOutputStream outputStream = new FileOutputStream(shakespeareFile,true);
			//write newline to separate original content from new content
			outputStream.write('\n');
			//write our output to output stream
			outputStream.write(content);
			//close output stream
			outputStream.close();
			System.out.println("New contents of shakespeare.txt written:");
		}catch(FileNotFoundException fe){
			System.out.println("Couldn't find the file called " + fileName);
		}catch(IOException ie){
			System.out.println("Couldn't write file called " + fileName);
		}
	}

	private static void reverseByteArray(byte[] inBytes) {
		int inLength = inBytes.length;
		for(int i=0; i<inBytes.length>>1; i++){
			byte temp = inBytes[i];
			inBytes[i] = inBytes[inLength-i-1];
			inBytes[inLength-i-1] = temp;
		}
		
	}

}
