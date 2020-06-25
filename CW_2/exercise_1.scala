package cw_2

object CW1 {
  def main(args: Array[String]):Unit={
    println(showDayMeaning("Wtorek"))
    println(showDayMeaning("Niedziela"))
    println(showDayMeaning("TestBraku"))
  }

  def showDayMeaning(day: String):String = day match{
    case "Sobota"|"Niedziela" => "Weekend"
    case "Poniedzialek"|"Wtorek"|"Sroda"|"Czwartek"|"Piatek" => "Praca"
    case _ => "Nie ma takiego dnia"
  }
}