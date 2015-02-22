package Problems

object p16 extends Problem {
  
  val exp = 1000
  
  override def solve(): Long = BigInt(2).pow(exp).toString.map(_.asDigit).sum
}
