package Problems

object p17 extends Problem {
  
  val simple_name = Array("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
    "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen")
    .map(_.length)
  
  val tens = Array("", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety")
    .map(_.length)
  
  val hundred = "hundred".length
  
  val thousand = "thousand".length
  
  val and = "and".length
  
  lazy val name: Int => Int = {
    case n if n < 20 =>
      simple_name(n)
    case n if n < 100 =>
      tens(n / 10) + (if (n % 10 > 0) simple_name(n % 10) else 0)
    case n if n < 1000 =>
      simple_name(n / 100) + hundred + (if (n % 100 > 0) and + name(n % 100) else 0)
    case n if n < 10000 =>
      simple_name(n / 1000) + thousand + (if (n % 1000 > 0) and + name(n % 1000) else 0)
  }
  
  override def solve(): Long = (1 to 1000).map(name).sum
}
