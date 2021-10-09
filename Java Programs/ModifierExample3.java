package com.ust.test;
 class Animal3 {
    
    public int legCount;

    
    public void display() {
        System.out.println("I am an animal.");
        System.out.println("I have " + legCount + " legs.");
    }
}

public class ModifierExample3 {
	

    public static void main( String[] args ) {
        
        Animal3 animal = new Animal3();

    
        animal.legCount = 4;
       
        animal.display();
    }


}
