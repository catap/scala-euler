package Problems

object p20 extends Problem {

  val zero = BigInt(0)

  def factorial(n: BigInt): BigInt =
    if (n == zero) 1
    else n * factorial(n - 1)

  override def solve(): Long = factorial(100).toString().map(_.asDigit).sum
}
