package com.ust.collections;

import com.ust.Employee12;

def list = [343 ,23 ,22, 33,3343,333,2,23,2,32,23];
def alphabets = 'a'..'z';
println alphabets

//alphabets.each{obj -> println obj}

for(obj in list){
	if(obj<25){
		println obj
	}
}

def filteredList = list.findAll{ it < 25}
println filteredList;

def emp = new Employee12()
emp.setFirstName('Ravi')
emp.setLastName('Sharma')
emp.setSalary(224.34)
emp.setAge(23)

def empMap = [9999111222: emp]
empMap.put(9999111333, emp);
println empMap instanceof Map;

println empMap;

println list instanceof List
//println list * list;