package com.ust.test;
abstract class Base {
 abstract void fun();
}
class Derived extends Base {
void fun()
  {
	System.out.println("Derived fun() called");
  }
}

public class AbstractExample1 {
	public static void main(String args[])
	{
	Base b = new Derived();
	b.fun();

}}
