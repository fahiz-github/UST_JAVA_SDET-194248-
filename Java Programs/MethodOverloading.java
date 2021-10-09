package com.ust.test;

public class MethodOverloading {
	void add(int a,int b) {
		System.out.println(a+b);
	}
	
	void add(float a,float b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
		obj.add(4,5);
		obj.add(10.5f, 5.5f);
		
		
		

	}

}
