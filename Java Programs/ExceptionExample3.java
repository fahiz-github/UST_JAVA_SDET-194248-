package com.ust.test;

public class ExceptionExample3 {
	
	
	 static void checkAge(int age) {
		 if (age < 18) {
		 throw new ArithmeticException("access denied -you must be at least 18 years old.");
		 }
		 else {
		 System.out.println("access granted - you are old enough!");
		 }
		 
		 }
		 public static void main(String[] args) {
			 
		 checkAge(15); 
		 
		 }
		 
		 
		 }
		 


