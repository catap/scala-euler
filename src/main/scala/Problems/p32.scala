package Problems

object p32 extends Problem {

  val numbers = for {
    a <- 2 to 100
    b <- 2 to (10000 / a)
    p = a * b
    s = f"$a$b$p"
    if s.length == 9
    if (1 to 9).mkString.forall(s.contains(_))
  } yield p

  override def solve(): Long = numbers.distinct.sum
}
