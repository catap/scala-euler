val numbers = 1 to 20

val min = (numbers.last to Int.MaxValue).find(n => numbers.forall(n % _ == 0))

println(min)