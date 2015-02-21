package Problems

object Problem1 extends Problem {
  val solve: Long =
    (1 until 1000).par.filter(i => i % 3 == 0 || i % 5 == 0).sum
}
