package com.ust.test;

public class MethodOverloadExample2 {
	
	int sum(int x,int y){
		 return x+y;

		}
		
		int sum(int x,int y,int z){
		 return x+y+z;

		} 

	public static void main(String[] args) {

		MethodOverloadExample2 obj = new MethodOverloadExample2();

System.out.println(obj.sum(20,30));
System.out.println(obj.sum(20,30,40));
	}

	}


