package com.ust.test;

public class StringFunctions {

	public static void main(String[] args) {
		String str1 = "Hello java";
		String str2 = "Hello python";
		
		if(str1.contains("java")) {
			System.out.println(str1 +" contains java");
		}
			else {System.out.println("not contains");}
		
		
		System.out.println("length of string is "+str1.length());
		System.out.println(str1.replace("java", "python"));
		System.out.println(str1.concat("......!!!"));
		System.out.println(str1.equals(str2));
		}
	
	}
/* output
  Hello java contains java
length of string is 10
Hello python
Hello java......!!!
false

 */


