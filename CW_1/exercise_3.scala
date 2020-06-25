package cw_1

object CW3 {
  def main(args: Array[String]):Unit={
    val days: List[String] = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")
    println(getDays(days, ""))
  }

  def getDays(list: List[String], text: String): String = list match {
    case Nil => ""
    case h :: t =>
      if (t.isEmpty) text + ", " + h
      else if (text.isEmpty) getDays(t, h)
      else getDays(t, text + ", " + h)
  }
}