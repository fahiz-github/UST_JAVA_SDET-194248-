package com.ust.test;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class FileExample7 {



	  public static void main(String args[]) {

	    String data = "This is a line of text inside the file(stream).";

	    try {
	      
	      FileOutputStream file = new FileOutputStream("C:\\\\Users\\\\Faiz\\\\Desktop\\\\myfolder\\\\output.txt");

	
	      OutputStreamWriter output = new OutputStreamWriter(file);

	      
	      output.write(data);

	     
	      output.close();
	    }

	    catch (Exception e) {
	      e.getStackTrace();
	    }
	  }

}
