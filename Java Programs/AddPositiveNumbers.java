package com.ust.test;

import java.util.Scanner;

public class AddPositiveNumbers {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter 10 numbers");
		for(int i=0;i<10;i++) {
			int num=sc.nextInt();
			if(num>0) {
				sum=sum+num;
			}
			
			
			
	}
		System.out.println("SUM OF POSITIVE NUMBERS ARE "+sum);

}
}
/* output
enter 10 numbers
-9
5
3
2
-2
1
4
-8
4
3
SUM OF POSITIVE NUMBERS ARE 22
*/

