package com.ust.test;

public class MethodOverloadExample4 {
	long sum(int x,long y){
		 return x+y;

		}
		
		int sum(int x,int y,int z){
		 return x+y;

		} 

	public static void main(String[] args) {
		MethodOverloadExample4 obj=new MethodOverloadExample4();

System.out.println(obj.sum(30,10));
System.out.println(obj.sum(50,20,30)); 

	}

}
