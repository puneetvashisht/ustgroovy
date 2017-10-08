package com.ust



def y  =3;

def x = 1 * 1.1   --> 2 bytes
                      16 bytes  

println x instanceof BigDecimal
x = y;
println x




println 67.compareTo(3334)

// words = ['bob', 'alpha', 'rotator', 'omega', 'reviver']
// filteredArr = words.findAll{str -> str==str.reverse() && str.size()>5};
// println filteredArr


// string = "an apple a day"
// println string.toList().unique().sort().join('')


// println 'apple'.toList()

// def str1 = 'hippopotamus'
// def str2 = (str1 - 'hippo' - 'mus' + 'to') * 3
// println str2

// def abc = "repeat" *3

// def str = """Some long
// string value $abc
// Weather is getting good 
// awsome sunshine and mild hot
// """
// println str;

// def arr = str.split('\n')
// println arr.join(' ');

// arr.each { obj -> println obj}

// println 'Hello Groovy!!'

// def name = "Ravi"

// println "Good Morning!! $name"

// assert 0.5 == 1/2

// def printSize(obj){
//     println obj.size();
// }

// def list = ['a', 'b']
// printSize(list);

// list.each{ obj -> println obj}