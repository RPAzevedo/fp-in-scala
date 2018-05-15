package fpinscala.functions

object Polymorphic {
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def checkTail(cursor: Int, last: Int): Boolean = {
      if (cursor == last) true
      else if (!ordered(as(cursor), as(cursor + 1))) false
      else checkTail(cursor + 1, last)
    }

    as match {
      case Array() => true
      case _ => {
        checkTail(0, as.length - 1)
      }
    }
  }

  def partial1[A,B,C](a: A, f: (A,B) => C): B => C = {
    (b: B) => f(a, b)
  }

  def curry[A,B,C](f: (A, B) => C): A => (B => C) = {
    (a: A) => (b: B) => f(a, b)
  }

  def uncurry[A,B,C](f: A => B => C): (A, B) => C = {
    (a: A, b: B) => f(a)(b)
  }

  def compose[A,B,C](f: B => C, g: A => B): A => C = {
    (a: A) => f(g(a))
  }
}
