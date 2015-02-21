package Problems

object p9 extends Problem {

  val limit = 1000

  lazy val (a, b, c) = (for (
    b <- 2 until limit;
    a <- 0 until b;
    c = limit - a - b
    if a * a + b * b == c * c
  ) yield (a, b, c)).head

  lazy val product = a * b * c

  override def solve(): String = product.toString
}
