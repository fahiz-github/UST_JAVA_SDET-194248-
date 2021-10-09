package com.ust.test;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileExample9 {


	  public static void main(String args[]) {

	    String data = "This is the data in the output file(b)";

	    try {
	     
	      FileWriter file = new FileWriter("C:\\Users\\Faiz\\Desktop\\myfolder\\output.txt");

	      
	      BufferedWriter output = new BufferedWriter(file);

	     
	      output.write(data);

	      
	      output.close();
	    }

	    catch (Exception e) {
	      e.getStackTrace();
	    }
	  }


}
