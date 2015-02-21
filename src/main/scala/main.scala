import scala.reflect.runtime.universe

object Main extends App {
  val problems = 1 to 6

  val runtimeMirror = universe.runtimeMirror(getClass.getClassLoader)

  def solveProblem(n: Int): Long =
    runtimeMirror.reflectModule(runtimeMirror.staticModule(f"Problems.p$n"))
      .instance.asInstanceOf[Problems.Problem]
      .solve
  
  (if (args.nonEmpty)
    args.map(_.toInt).toList
  else problems.toList)
    .foreach{ problem =>
    val solve = solveProblem(problem)
    println(f"Problem $problem: $solve")
  }
}
