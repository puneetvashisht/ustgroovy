def abc = 324234324323434233432343.343443434
println abc;

switch (6) {
    case 0: println '0' ; break 
    case [8,9,11]: println('8,9,11'); break 
    case Double: println('floating point'); break
    case {it % 3 == 0} : println ('Divisible by 3'); break
    case 0..9: println('Range'); break
    default: println 'default'

}
