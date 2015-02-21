package Problems

object p7 extends Problem {
  lazy val prime: Stream[Int] =
    2 #:: Stream.from(3).filter(i => prime.takeWhile(j => i >= (j * j)).forall(i % _ > 0))

  lazy val number = prime(10000)

  override def solve(): String = number.toString
}
