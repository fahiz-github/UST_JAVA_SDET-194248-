package com.ust.test;

public class OuterExample2 {
	static class Nested_Demo {
		 public void my_method() {
		 System.out.println("This is my nested class");
		 }
		 }

		 public static void main(String args[]) {
			 OuterExample2 .Nested_Demo nested = new OuterExample2 .Nested_Demo();
		 nested.my_method();
		 }

}
