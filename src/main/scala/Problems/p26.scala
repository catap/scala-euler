package Problems

object p26 extends Problem {

  lazy val prime: Stream[Int] =
    2 #:: Stream.from(3).filter(i => prime.takeWhile(j => i >= (j * j)).forall(i % _ > 0))

  val ten = BigInt(10)
  val one = BigInt(1)

  def longest_period(n: Int) = prime.takeWhile(_ < n).filter(prime =>
    prime - 1 == (1 until prime)
      .find(ten.modPow(_, prime) == one)
      .getOrElse(prime)
  ).max

  override def solve(): Long = longest_period(1000)

}
