package Problems

object p29 extends Problem {
  
  val as = 2 to 100
  val bs = 2 to 100
  
  override def solve(): Long = as.flatMap(a => bs.map(b => BigInt(a).pow(b))).distinct.size
}
