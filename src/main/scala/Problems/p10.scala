package Problems

object p10 extends Problem {

  val max = 2000000

  lazy val primes = p7.prime.takeWhile(_ <= max)

  lazy val sum = primes.map(_.toLong).sum

  override def solve(): Long = sum
}
