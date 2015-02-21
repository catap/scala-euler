package Problems

object p4 extends Problem {
  lazy val numbers = 100 to 999

  lazy val max = numbers.flatMap(i => numbers.map(i * _))
      .filter(p => p.toString == p.toString.reverse).max

  override def solve(): String = max.toString
}