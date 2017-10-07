package com.ust.collections


map = [1:'a', 2:'b', 3:'c']
//def str = new String();

def cityList = [
	[name:'Delhi', 'country':'India'],
	[name:'Mumbai', 'country':'India'],
	[name:'Dakar', 'country':'Senegal'],
	[name:'Delhi', 'country':'Senegal']
] 

println cityList

println cityList.groupBy{it.country}

//def str = map.collect{ k, v -> "$k:$v" }
//
//print str;

//map = [:]
//map[1] = 'One';
//map[2] = 'Two';
//println map;
//map.each{it -> println it}
//def sb = new StringBuffer();
//[1:'a', 2:'b', 3:'c'].each{ k, v->  sb <<"$k:$v, " }
//def str = sb.toString()


//def numberMap = [23:'Twenty Three', 12:'Twelve'];
//numberMap.each{obj -> println obj.key}
//numberMap.each{obj -> println obj.value}

//for(key in numberMap.keySet()){
//	println key;
//	println numberMap.get(key);
//}
//
//for(Integer key: numbersMap.keySet()){
//	System.out.println(key);
//	System.out.println(numbersMap.get(key));
//}
