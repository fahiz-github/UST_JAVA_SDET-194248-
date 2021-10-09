package com.ust.test;

public class ArraySum {
	public static void main(String args[]) {
		int sum=0;
	
		int mark[]= {10,20,31,40};
		for(int i:mark) {
			sum=sum+i;
		}
		int arrayLength=mark.length;
		double average=(double)sum/(double)arrayLength;


		   System.out.println("Sum = " + sum);
		   System.out.println("Average = " + average);

	

}
}
