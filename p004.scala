val numbers = 100 to 999

val max = numbers.par.flatMap(i => numbers.map(i * _))
  .filter(p => p.toString == p.toString.reverse).max

println(max)