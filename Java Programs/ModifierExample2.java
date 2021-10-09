package com.ust.test;

class Data2 {
    private String name;

    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name= name;
    }
}
public class ModifierExample2 {
    public static void main(String[] main){
        Data2 d = new Data2();

        
        d.setName("abc");
        System.out.println(d.getName());
    }
}

