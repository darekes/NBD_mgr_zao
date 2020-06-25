package cw_2

object CW4 {
  def main(args: Array[String]): Unit = {
    println(math(x => x * x, 2))
  }

  def math(f: Int => Int, a: Int): Int = f(f(f(a)))
}