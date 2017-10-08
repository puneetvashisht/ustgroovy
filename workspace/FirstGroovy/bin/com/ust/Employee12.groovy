package com.ust

class Employee123 {
    def firstName, lastName;
    def age;
    def salary;

    public void increment(int amount){
        salary = salary+amount;
    }
    public String toString() { 
        return "Employee: firstName -- $firstName lastName -- $lastName age -- $age salary -- $salary"
    }
}

def emp = new Employee123(firstName:'Ravi', lastName:'Sharma', age :34, salary:34354.23)
// emp.setFirstName('Ravi');
println emp.getFirstName();
println emp;