package Problems

object p7 extends Problem {
  lazy val prime: Stream[Int] =
    2 #:: Stream.from(3).filter(i => prime.takeWhile(j => i >= (j * j)).forall(i % _ > 0))

  val solve: Long = prime(10000)
}
