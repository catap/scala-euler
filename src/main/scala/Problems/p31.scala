package Problems

object p31 extends Problem {
  
  def dw(notes: List[Int], n: Int): Long = notes match {
    case h :: _ if n == h => 1
    case h :: t if n > 0 => dw(notes, n - h) + dw(t, n)
    case _ => 0
  }
  
  override def solve(): Long = dw(List(1, 2, 5, 10, 20, 50, 100, 200), 200)
}
