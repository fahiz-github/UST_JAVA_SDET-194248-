package com.ust.junit;

public class DivisionTest {
	//data members
	int num1, num2;

	public DivisionTest(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}

	//division method
	public int division() throws ArithmeticException{
		return num1/num2;
	}
}


