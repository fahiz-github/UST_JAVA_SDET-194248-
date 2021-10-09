package com.ust.test;

import java.util.ArrayList;

public class CollectionsExample1 {
	
	public static void main(String[] args) {
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Benz");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Audi");
	    for (String i : cars) {
	      System.out.println(i);
	    }
	  }

}
