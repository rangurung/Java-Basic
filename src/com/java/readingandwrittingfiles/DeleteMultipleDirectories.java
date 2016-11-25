package com.java.readingandwrittingfiles;

import java.io.File;

public class DeleteMultipleDirectories {

	public static void main(String[] args) {
		
		String currentPath = "C:";
		String [] pathParts = {"test1", "test2", "test3::fail"};
		for(String pathPart : pathParts){
			currentPath += File.separator + pathPart;
			File testDirectory = new File(currentPath);
			if(!testDirectory.mkdir()){
				System.out.println("Failed to create " + testDirectory + 
									"; removing all created directories");
				removePathParts("C:", pathParts);
			}else{
				System.out.println("Created " + testDirectory);
			}
		}

	}

	private static void removePathParts(String pathStart, String[] pathParts) {
		String currentPath = pathStart;
		String [] paths = new String[pathParts.length];
		
		//Build a array of possible paths
		for(int pathCounter = 0; pathCounter < pathParts.length; pathCounter++){
			currentPath = File.separator + pathParts[pathCounter];
			paths[pathCounter] = currentPath;
		}
		//Checking for existence of each path backward and deleting each one if exist
		for(int pathCounter = pathParts.length-1; pathCounter >= 0; pathCounter--){
			File currentFile = new File(paths[pathCounter]);
			if(currentFile.delete()){
				System.out.println("Removed " + currentFile);
			}
		}
		
	}

}
