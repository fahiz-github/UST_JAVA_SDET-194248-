package com.ust.test;
import java.util.Scanner;

public class SumOfPositiveNumbers {
	public static void main(String[] args) {

    int sum = 0;
    int number=0;

    // create an object of Scanner class
    Scanner input=new Scanner(System.in);
    number = input.nextInt();


    // take integer input from the user
    
	   
    // while loop continues 
    // until entered number is positive
    while (number >= 0) {
      // add only positive numbers
      sum += number;

      System.out.println("Enter a number");
      number = input.nextInt();
    }
	   
    System.out.println("Sum = " + sum);
    input.close();
  }

}

