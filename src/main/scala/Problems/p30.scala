package Problems

object p30 extends Problem {
  
  val p = 5

  def max(p: Int) = Math.pow(10, p).toInt - 1

  def sum(n: Int) =
    n.toString.map(c => Math.pow(c.asDigit, p).toInt).sum
  
  val last = Stream.from(1).find(n => max(n) > sum(max(n))).get
  
  override def solve(): Long =
    (2 to max(last)).filter(n => sum(n) == n).sum
}
