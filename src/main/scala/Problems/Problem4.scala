package Problems

object Problem4 extends Problem {
  val numbers = 100 to 999

  val solve: Long =
    numbers.par.flatMap(i => numbers.map(i * _))
      .filter(p => p.toString == p.toString.reverse).max
}