package com.ust.test;
class ABC{

	 public void disp()
	 {
	System.out.println("disp() method of parent class");
	 }
	}

public class Demo extends ABC{
	 public void disp(){
		 System.out.println("disp() method of Child class"); }
	 public void newMethod(){
		 System.out.println("new method of child class");
		  }

	public static void main(String[] args) {
		ABC obj = new ABC();
		obj.disp();//canot give newmethod
		
		ABC obj2 = new Demo();
		//Demo d=(Demo) new ABC;
		obj2.disp();

	}

}
