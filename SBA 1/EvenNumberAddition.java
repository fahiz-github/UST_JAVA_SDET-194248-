package com.ust.test;

import java.util.Scanner;

public class EvenNumberAddition {

	public static void main(String[] args) {
		int sum=0,count=0;
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=50;i++) {
			int num=sc.nextInt();
			if(num%2!=0 ) {
				continue;}
			else {
				sum=sum+num;
				count=count+1;
				if(count==10) {break;
			}
			
		}

	} System.out.println("SUM OF EVEN NUMBERS ARE "+sum);

}
}
/* output
enter number

2
3
4
5
6
7
8
4
10
15
45
76
84
25
18
16
SUM OF EVEN NUMBERS ARE 228
*/

