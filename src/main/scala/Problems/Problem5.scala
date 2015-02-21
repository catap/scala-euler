package Problems

object Problem5 extends Problem {
  val numbers = 1 to 20

  val solve: Long =
    (numbers.last to Int.MaxValue).find(n => numbers.forall(n % _ == 0)).get
}