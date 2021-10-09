package com.ust.test;

class Test_this4
{
int val_a;
int val_b;
Test_this4()
{
val_a = 10;
val_b = 20;
}
Test_this4 get()
{
return this;
}
void display()
{
System.out.println("val_a = " + val_a + " val_b = " + val_b);
}
}


public class ThisExample4 {

	public static void main(String[] args) {
		Test_this4 object = new Test_this4();
		object.get().display();

	}

}
