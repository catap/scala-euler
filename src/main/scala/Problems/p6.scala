package Problems

object p6 extends Problem {
  val numbers = 1 to 100

  def square(n: Int) = n * n

  val solve: Long =
    square(numbers.sum) - numbers.map(square).sum
}