package com.ust;

import java.util.Arrays;
import java.util.List;

class Employee implements Comparable<Integer>{
    String firstName, lastName;
    int age;
    Double salary;
    
    

    public Employee(String firstName, String lastName, int age, Double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public Double getSalary() {
		return salary;
	}



	public void setSalary(Double salary) {
		this.salary = salary;
	}



	public void increment(int amount){
        salary = salary+amount;
    }



	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", salary=" + salary
				+ "]";
	}
	
	public static void main(String[] args) {

        Integer i = 3;
        System.out.println(i);
		
		String str = "anything";
		String replacedStr = str.replace("any", "some");
		System.out.println(replacedStr);
		String [] arr = str.split("");
		List<String> strs = Arrays.asList(arr);
		System.out.println(strs);
//		System.out.println(str * "any");
		System.out.println(new Employee("Ravi", "Sharma", 34, 33243.0));
	}



	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}



}