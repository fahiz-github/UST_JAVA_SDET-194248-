package com.ust.test;

public class MethodOverloadExample3 {
double sum(int x,double y){
	 return x+y;

	}

	double sum(double x,int y){
	 return x+y;

	}

	public static void main(String[] args){ 


		MethodOverloadExample3 obj = new MethodOverloadExample3();

System.out.println(obj.sum(30,30.2));
System.out.println(obj.sum(50.2,20));
}
	

}
