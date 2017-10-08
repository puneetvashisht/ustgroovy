doubleNum = { num -> num * 2 }
print doubleNum(34);


processThenPrint = { num, closure ->
num = closure(num); println "num is $num"
}

halfNum = {num -> num/2}

processThenPrint(3, doubleNum);
processThenPrint(10){it / 2} 

// [0, 1, 2].each { num -> println num}
// [0, 1, 2].each { println it}

 def houston(Closure doit) {
    (10..1).each { count ->
       println doit(count)
    }
}

houston({it/2});