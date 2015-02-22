package Problems

object p21 extends Problem {

  def d(n: Int) =
    (1 until n).filter(n % _ == 0).sum

  def isAmicablePair(n: Int, dn: Int) =
    n != dn && d(dn) == n
  
  def isAmicable(n: Int) =
    isAmicablePair(n, d(n))
  
  override def solve(): Long =
    (1 until 10000).filter(isAmicable).sum
}
