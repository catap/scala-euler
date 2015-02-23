package Problems

object p25 extends Problem {
  lazy val fibonacci: Stream[BigInt] =
    0 #:: 1 #:: fibonacci.zip(fibonacci.tail).map(p => p._1 + p._2)

  override def solve(): Long = fibonacci.takeWhile(_.toString.length < 1000).size
}
