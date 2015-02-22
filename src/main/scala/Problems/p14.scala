package Problems

object p14 extends Problem {

  def steps(n: Long): Long = {
    var l = 0L
    var c = n
    while (c > 0) {
      l += 1
      if (c == 1) c = 0
      else
        c = if (c % 2 == 0) c / 2
          else 3 * c + 1
    }
    l
  }

  override def solve(): Long = (1 until 1000000)
    .map(n => (n, steps(n)))
    .reduce((left, right) => if (left._2 > right._2) left else right)
    ._1
}
