package com.ust.test;
class This_Test1
{
int val1;
int val2;
// Parameterized constructor
This_Test1(int val1, int val2)
{
this.val1 = val1 + val1;
this.val2 = val2 + val2;
}
void display()
{
System.out.println("Value val1 = " + val1 + " Value val2 = " + val2);
}
}
public class ThisExample1 {

	public static void main(String[] args) {
		This_Test1 object = new This_Test1(5,10);
		object.display();

		

		

	}

}
