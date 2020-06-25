package cw_1

object CW2 {
  def main(args: Array[String])={
    val days: List[String] = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")
    println(getDays(days))
    println(getReversedDays(days))
  }

  def getDays(myList:List[String]):String={
    var separator = ", "

    if (myList.isEmpty) {
      return ""
    }

    if (myList.tail.isEmpty) {
        separator = ""
    }
      
    return myList.head + separator + getDays(myList.tail)
  }

  def getReversedDays(myList:List[String]):String= myList match {
    case myList: List[String] if myList.tail.isEmpty => myList.head
    case _ => getDaysReverse(myList.tail) + ", " + myList.head
  }
}