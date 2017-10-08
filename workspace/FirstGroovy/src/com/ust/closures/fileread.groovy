// new File('/Users/puneetvashisht/work/trainings/ustgroovy/workspace/FirstGroovy/src/com/ust/closures/fileread.groovy').eachLine { 
//     println it
// }

def result = [1, 2, 3].any{ it % 2 == 0 }

println result

def add = { x, y -> x + y }
println add(2,3);

def sum(x, y) {
   return x+y;
}
println sum(2,3);