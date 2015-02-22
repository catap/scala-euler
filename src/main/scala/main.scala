import java.util.concurrent.TimeUnit

import scala.reflect.runtime.universe

object Main extends App {
  val problems = 1 to 11

  val runtimeMirror = universe.runtimeMirror(getClass.getClassLoader)

  def solveProblem(n: String): String =
    runtimeMirror.reflectModule(runtimeMirror.staticModule(f"Problems.p$n"))
      .instance.asInstanceOf[Problems.Problem]
      .solve()
  
  def durationBreakdown(duration: Long): String = {
    var nanos = duration

    val days = TimeUnit.NANOSECONDS.toDays(nanos)
    nanos -= TimeUnit.DAYS.toNanos(days)

    val hours = TimeUnit.NANOSECONDS.toHours(nanos)
    nanos -= TimeUnit.HOURS.toNanos(hours)

    val minutes = TimeUnit.NANOSECONDS.toMinutes(nanos)
    nanos -= TimeUnit.MINUTES.toNanos(minutes)

    val seconds = TimeUnit.NANOSECONDS.toSeconds(nanos)
    nanos -= TimeUnit.SECONDS.toNanos(seconds)

    val millis = TimeUnit.NANOSECONDS.toMillis(nanos)
    nanos -= TimeUnit.MILLISECONDS.toNanos(millis)

    val micros = TimeUnit.NANOSECONDS.toMicros(nanos)
    nanos -= TimeUnit.MICROSECONDS.toNanos(micros)
    
    val sb = new StringBuilder()

    def append(duration: Long, symbol: String) =
      if (duration > 0) {
        if (sb.nonEmpty)
          sb.append(" ")
        sb.append(duration)
        sb.append(symbol)
      }

    append(days, "d")
    append(hours, "h")
    append(minutes, "m")
    append(seconds, "s")
    append(millis, "ms")
    append(micros, "µs")
    append(nanos, "ns")

    sb.toString()
  }
  
  (if (args.nonEmpty)
    args.map(_.toString).toList
  else problems.map(_.toString).toList)
    .foreach{ problem =>
    val start = System.nanoTime()
    val solve = solveProblem(problem)
    val end = System.nanoTime()
    val elapsed = durationBreakdown(end - start)
    println(f"Solved problem $problem: $solve for $elapsed")
  }
}
