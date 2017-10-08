package com.ust

public class Employee12{
    def firstName, lastName;
    int age;
    Double salary;

    public void increment(int amount){
        salary = salary+amount;
    }
public String toString() { 
    return "Employee: firstName -- $firstName lastName -- $lastName age -- $age salary -- $salary"
}
}