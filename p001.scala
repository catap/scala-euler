val sum = (1 until 1000).par.filter(i => i % 3 == 0 || i % 5 == 0).sum

println(sum)
