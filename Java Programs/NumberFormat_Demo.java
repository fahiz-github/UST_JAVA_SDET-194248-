package com.ust.test;

public class NumberFormat_Demo {
	public static void main(String args[])
	{
	try {
	
	int num = Integer.parseInt ("aka") ;
	System.out.println(num);
	} catch(NumberFormatException e) {
		System.out.println("Number format exception");
	}
	}
	}


