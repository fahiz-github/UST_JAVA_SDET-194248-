package com.ust.test;

class Animal1 {
    
    protected void display() {
        System.out.println("I am an animal");
    }
}

class Dog1 extends Animal1 {
    public static void main(String[] args) {

       
        Dog1 dog = new Dog1();
        
        dog.display();
    }
}


