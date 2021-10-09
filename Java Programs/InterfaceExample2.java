package com.ust.test;

interface A1{
	 void add(int a,int b);
	 
}

interface B{
	void mul(int c,int d);
}
interface C extends A1,B{
	void div(int x,int y); 
	
	
}

public class InterfaceExample2 implements C {
	public  void add(int a,int b) {
		System.out.println(a+b);
	}
	 
	public  void mul(int c,int d) {
		System.out.println(c*d);
	}
	
	
	public void div(int x,int y) {
		System.out.println(x/y);
	}
	
	 
	
	public static void main(String args[]) {
		
		
		InterfaceExample2 ob= new InterfaceExample2();
		ob.add(10, 20);
		
		
		
		
	}
	}

