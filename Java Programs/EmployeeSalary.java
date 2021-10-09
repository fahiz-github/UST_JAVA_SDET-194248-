package com.ust.test;
public abstract class Employee {
private String name;
private int paymentPerHour;
public Employee(String name, int paymentPerHour) {
this.name = name;
this.paymentPerHour = paymentPerHour;
}
public abstract int calculateSalary();
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getPaymentPerHour() {
return paymentPerHour;
}
public void setPaymentPerHour(int paymentPerHour) {
this.paymentPerHour = paymentPerHour;
}
}

public class NewEmployee extends Employee {
    public NewEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * 10;
    }
}


public class EmployeeSalary {
	
	public static void main(String[] args) {

        Employee ob = new NewEmployee("employee", 10);
        System.out.println(ob.calculateSalary());
    }

}
