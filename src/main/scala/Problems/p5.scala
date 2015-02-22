package Problems

object p5 extends Problem {
  lazy val numbers = 1 to 20

  lazy val number = (numbers.last to Int.MaxValue).find(n => numbers.forall(n % _ == 0)).get

  override def solve(): Long = number
}