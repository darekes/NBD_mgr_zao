package cw_2

object CW5 {
  def main(args: Array[String]):Unit={
    val student = new Osoba("Darek", "Samsel") with Student

    val nauczyciel = new Osoba("Jan", "Nowak") with Nauczyciel
    nauczyciel.pensja_(1000)

    val pracownik = new Osoba("Kazimierz", "Pracujacy") with Pracownik
    pracownik.pensja_(1000)

    val studentPraca = new Osoba("Michal", "Janik") with Student with Pracownik
    studentPraca.pensja_(1000)

    val studentPraca2 = new Osoba("Ernest", "Bakcyl") with Pracownik with Student
    studentPraca2.pensja_(1000)

    val studentNauczyciel = new Osoba("Jakub", "Owilski") with Student with Nauczyciel
    studentNauczyciel.pensja_(1000)

    println("Student, podatek: " + student.podatek)
    println("Nauczyciel, podatek: " + nauczyciel.podatek)
    println("Pracownik, podatek: " + pracownik.podatek)
    println("Pracujacy student, podatek: " + studentPraca.podatek)
    println("Pracujacy student2, podatek: " + studentPraca2.podatek)
    println("Student nauczyciel, podatek: " + studentNauczyciel.podatek)
  }

  abstract class Osoba(private var _imie: String, private var _nazwisko: String){
  	def imie: String = _imie
  	def nazwisko: String = _nazwisko
  	def podatek: Double
  }

  trait Pracownik extends Osoba {
  	override def podatek: Double = pensja * 0.2
  	private var _pensja: Double = _
  	def pensja:Double = _pensja
  	def pensja_(value:Double):Unit = _pensja = value
  }

  trait Nauczyciel extends Pracownik {
  	override def podatek: Double = pensja * 0.1
  }

  trait Student extends Osoba {
  	override def podatek: Double = 0
  }
}