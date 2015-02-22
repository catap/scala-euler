package Problems

object p19 extends Problem {

  val month_length = Array(31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

  lazy val month_length_by_year =
    for (y <- 1900 to 2000; m <- 1 to 12)
    yield {
      if (m == 2)
        if (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0)) 29 else 28
      else month_length(m - 1)
    }

  lazy val month_starts = month_length_by_year
    .scan(1)((weekly_start, month_duration) =>
      (weekly_start + month_duration) % 7)
    .drop(12) // skip 1900 year

  override def solve(): Long = month_starts.count(_ == 0)
}
