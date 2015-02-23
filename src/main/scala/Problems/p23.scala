package Problems

object p23 extends Problem {
  
  def sumDivisors(n: Int) =
    (1 until n).filter(n % _ == 0).sum

  def isAbundant(n: Int) =
    sumDivisors(n) > n

  val limit = 28123
  
  lazy val abundant = (1 to limit).filter(isAbundant)

  lazy val sumTwoAbundant = {
    val sumTwoAbundant = new Array[Boolean](limit + 1)

    for (a <- abundant) {
      for (b <- abundant) {
        if (a + b <= limit)
          sumTwoAbundant(a + b) = true
      }
    }
    
    sumTwoAbundant
  }

  override def solve(): Long = (1 to limit).filterNot(sumTwoAbundant).sum
}
