package Problems

object p6 extends Problem {
  lazy val numbers = 1 to 100

  def square(n: Int) = n * n

  lazy val sum = square(numbers.sum) - numbers.map(square).sum

  override def solve(): Long = sum
}