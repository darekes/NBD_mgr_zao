package cw_1


import scala.collection.mutable.ListBuffer

object CW1 {
  def main(args: Array[String]):Unit={
    val days: List[String] = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")
    println(getDays(days))
    println(getDaysStartsWithPLetter(days))
    println(getDaysWithWhile(days))
  }

  def getDays(days: List[Any]): String = {
    var text = ""
    var separator = ", "
    var iterator = 0

    if (days.nonEmpty) {
      for(element<-days){
        if(iterator == days.length-1){
          separator = ""
        }
        text = text + element + separator
        iterator += 1
      }
    }
    text
  }

  def getDaysStartsWithPLetter(days: List[String]): String ={
    var daysStartsOnP = new ListBuffer[String]()
    if (days.nonEmpty) {
      for (element <- days) {
        if (element.startsWith("P")) {
          daysStartsOnP += element
        }
      }
      daysStartsOnP.mkString(", ")
    } else {
      ""
    }
  }

  def getDaysWithWhile(days: List[String]): String={
    var text = ""
    if (days.nonEmpty) {
      val listLength = days.length
      var iterator = 0
      var separator = ", "

      while (iterator < listLength) {
        if (iterator == listLength-1) {
          separator = ""
        }
        text += days(iterator) + separator
        iterator += 1
      }
    }
    text
  }
}