val numbers = 1 to 100

def square(n: Int) = n * n

val different = square(numbers.sum) - numbers.map(square).sum

println(different)