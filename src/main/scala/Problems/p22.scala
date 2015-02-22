package Problems

import scala.io.Source

object p22 extends Problem {

  lazy val names = Source.fromInputStream(getClass.getResourceAsStream("p022_names.txt")).mkString
    .split(",").map(_.replace("\"", "")).sorted.zipWithIndex

  val A = 'A'.toLong - 1

  override def solve(): Long = names.map { case (name, idx) =>
    (idx + 1) * name.map(c => c.toLong - A).sum
  }.sum
}
