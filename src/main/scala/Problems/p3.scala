package Problems

object p3 extends Problem {
  def factors(n: Long): List[Long] =
    (2 to math.sqrt(n).toInt).find(n % _ == 0)
      .map(i => i.toLong :: factors(n / i)).getOrElse(List(n))

  lazy val max = factors(600851475143L).last

  override def solve(): String = max.toString
}