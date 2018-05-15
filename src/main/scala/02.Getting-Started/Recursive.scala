package fpinscala.functions

object Recursive {
  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc: Int): Int = {
      if (n <= 1) acc
      else go(n - 1, acc * n)
    }
    go(n, 1)
  }

  def fibonacci(n: Int): Int = {
    @annotation.tailrec
    def go(steps: Int, ant1: Int, ant2: Int): Int = {
      if (steps > 1) go(steps - 1, ant1 + ant2, ant1)
      else ant1 + ant2
    }

    if (n <= 0) 0
    else go(n - 1, 1, 0)
  }
}
