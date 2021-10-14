package com.ust.test;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string to reverse");
		String str=sc.nextLine();
		
		 char ch[]=str.toCharArray();  
		    String rev="";  
		    for(int i=ch.length-1;i>=0;i--){  
		        rev+=ch[i];  
		    }  
		   System.out.println("reversed string is "+rev);  
		} 
		

        
	}

/* output
 enter string to reverse

java is good
reversed string is doog si avaj
*/



