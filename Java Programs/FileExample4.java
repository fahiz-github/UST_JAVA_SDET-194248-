package com.ust.test;

import java.io.File;

public class FileExample4 {

	  public static void main(String[] args) {

	    
	    File file = new File("C:\\Users\\Faiz\\Desktop\\myfolder\\file.txt");

	    
	    boolean value = file.delete();
	    if(value) {
	      System.out.println("The File is deleted.");
	    }
	    else {
	      System.out.println("The File is not deleted.");
	    }
	  }


}
