package Problems

object p27 extends Problem {

  lazy val prime: Stream[Int] =
    2 #:: Stream.from(3).filter(i => prime.takeWhile(j => i >= (j * j)).forall(i % _ > 0))

  def isPrime(n: Int) = prime.takeWhile(_ <= n).contains(n)

  lazy val (a, b, _) = (-999 to 999).flatMap { a =>
    (-999 to 999).map(b => (a, b, (0 to 1000)
      .takeWhile(n => isPrime(n * n + a * n + b)).size))
  }.reduce((a, b) => if(a._3 > b._3) a else b)

  override def solve(): Long = a * b
}
