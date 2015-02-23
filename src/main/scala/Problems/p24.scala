package Problems

object p24 extends Problem {
  
  val source = List("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
  
  override def solve(): Long = source.permutations.drop(999999).next().mkString.toLong
}
