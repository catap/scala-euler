package Problems

import scala.io.Source

object p67 extends Problem {

  val data = Source.fromInputStream(getClass.getResourceAsStream("p067_triangle.txt")).mkString

  val rows = data.split("\\n").map(_.split("\\s+").map(_.toLong))

  override def solve(): Long = p18.optimalSubTree(rows)
}
