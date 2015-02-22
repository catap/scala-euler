package Problems

object p15 extends Problem {

  val zero = BigInt(0)

  def factorial(n: BigInt): BigInt =
    if (n == zero) 1
    else n * factorial(n - 1)

  def s(n: Int) = factorial(BigInt(2 * n)) / (factorial(BigInt(n)) * factorial(BigInt(n)))

  override def solve(): Long = s(20).toLong
}
