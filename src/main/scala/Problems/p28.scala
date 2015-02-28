package Problems

object p28 extends Problem {
  val levels = 1001

  def levelCornersSum(level: Int) = {
    if (level < 1 || level % 2 == 0) 0
    else {
      if (level == 1) 1
      else {
        val first = (level - 2) * (level - 2) + 1
        val step = level - 1
        4 * first - 4 + 10 * step
      }
    }
  }
  
  override def solve(): Long = (1 to levels).map(levelCornersSum).sum
}
