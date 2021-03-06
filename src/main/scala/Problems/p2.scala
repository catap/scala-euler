package Problems

object p2 extends Problem {
  lazy val fibonacci: Stream[Int] =
    0 #:: 1 #:: fibonacci.zip(fibonacci.tail).map(p => p._1 + p._2)

  lazy val sum = fibonacci.view.takeWhile(_ <= 4000000).filter(_ % 2 == 0).sum

  override def solve(): Long = sum
}