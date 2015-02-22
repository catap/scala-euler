package Problems

object p12 extends Problem {

  lazy val triangle: Stream[Int] =
    0 #:: Stream.from(1).map(t => triangle(t - 1) + t)

  def factors_count(n: Int) =
    (1 to Math.sqrt(n).toInt + 1)
      .foldLeft(0) { case (acc, i) =>
      if (n % i == 0) acc + 2 else acc
    }

  override def solve(): Long = triangle.find(factors_count(_) > 500).get
}
