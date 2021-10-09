package com.ust.test;

interface In1
{
final int a = 10;
default void display()
{
System.out.println("hello");
}
}

public class InterfaceExample3 implements In1 {
	public static void main (String[] args)
	{
		InterfaceExample3 t = new InterfaceExample3();
	t.display();
	}


}
