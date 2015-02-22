package Problems

object p10 extends Problem {
  
  lazy val prime: Stream[Int] =
    2 #:: Stream.from(3).filter(i => prime.takeWhile(j => i >= (j * j)).forall(i % _ > 0))

  override def solve(): Long = prime.takeWhile(_ <= 2000000).map(_.toLong).sum
}
