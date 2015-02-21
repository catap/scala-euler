package Problems

object p1 extends Problem {
  lazy val sum = (1 until 1000).filter(i => i % 3 == 0 || i % 5 == 0).sum
  
  override def solve: String = sum.toString
}
