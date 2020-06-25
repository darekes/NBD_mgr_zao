package cw_1

object CW4 {
  def main(args: Array[String]): Unit={
    val days: List[String] = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")
    println(left(days))
    println(right(days))
    println(leftWithPLetter(days))
  }

  def left(days: List[String]): String={
    days.tail.foldLeft(days.head)((a, b) => a + ", " + b )
  }

  def right(days: List[String]): String={
    days.foldRight("")((a, b) => if (b.isEmpty) a else a + ", " + b)
  }

  def leftWithPLetter(days: List[String]): String={
    days.tail.foldLeft(days.head) { (element, input) => if (input.startsWith("P")) element + ", " + input  else element }
  }


}