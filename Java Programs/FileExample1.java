package com.ust.test;
import  java.io.File;

public class FileExample1 {
	public static void main(String[] args) {

	   
	    File file = new File("C:\\Users\\Faiz\\Desktop\\myfolder\\File1.txt");

	    try {

	      
	      boolean value = file.createNewFile();
	      if (value) {
	        System.out.println("The new file is created.");
	      }
	      else {
	        System.out.println("The file already exists.");
	      }
	    }
	    catch(Exception e) {
	      e.getStackTrace();
	    }
	  }


}
