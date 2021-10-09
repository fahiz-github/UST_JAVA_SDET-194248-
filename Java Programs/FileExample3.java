package com.ust.test;
import java.io.FileWriter;

public class FileExample3 {
	
	   public static void main(String args[]) {

		     String data = "This is the data in the output file \n 1";
		     try {
		       
		       FileWriter output = new FileWriter("C:\\Users\\Faiz\\Desktop\\myfolder\\output.txt");

		      
		       output.write(data);
		       System.out.println("Data is written to the file.");

		      
		       output.close();
		     }
		     catch (Exception e) {
		       e.getStackTrace();
		     }
		  }


}
