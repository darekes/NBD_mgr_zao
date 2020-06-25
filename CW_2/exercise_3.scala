package cw_2

object CW3 {
  def main(args: Array[String]):Unit={
    println(sayHello(new Osoba("Darek", "Samsel")))
    println(sayHello(new Osoba("Janina", "Nowak")))
    println(sayHello(new Osoba("Ernest", "Jakobowski")))
  }

  def sayHello(osoba: Osoba): String = osoba match{
    case Osoba(_, "Samsel") => "Hello mr Samsel!"
    case Osoba("Janina", _) => "Hello Jacka!"
    case _ => "Hello, " + osoba.imie + " " + osoba.nazwisko
  }
}

case class Osoba(private var _imie: String, private var _nazwisko: String){
  def imie: String = _imie
  def nazwisko: String = _nazwisko
}