package com.ust.test;

public class SimpleArray {
	
	
	public static void main(String[] args) {
		int age[]= {10,20,30,40};
		System.out.println("using for loop");
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}
			
			System.out.println("using for each");
			for(int j :age)
			{
				System.out.println(j);
		
		}
	}

}
