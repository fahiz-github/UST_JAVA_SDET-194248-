package com.ust.test;

class Test<T, U>
{
T obj1; 
U obj2; 
Test(T obj1, U obj2)
{
this.obj1 = obj1;
this.obj2 = obj2;
}
public void print()
{
System.out.println(obj1);
System.out.println(obj2);
}
}



public class GenericsExample3 {
	
	public static void main (String[] args)
	{
	Test <String, Integer> obj =
	new Test<String, Integer>("GfG", 15);
	obj.print();
	}


}
