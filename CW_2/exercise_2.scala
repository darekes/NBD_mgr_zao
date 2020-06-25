package cw_2

object CW2 {
  def main(args: Array[String]):Unit={
    val konto1 = new KontoBankowe(10.0)
    println(konto1.stanKonta)
    konto1.wplata(100.00)
    println(konto1.stanKonta)
    konto1.wyplata(50.0)
    println(konto1.stanKonta)
  }
}


class KontoBankowe(private var _stanKonta: Double) {

  def this(){
    this(_stanKonta = 0.0)
  }

  def stanKonta: Double = _stanKonta

  def wplata(amount: Double):Unit={
    if (amount > 0) {
      _stanKonta = amount + _stanKonta
    } else {
      throw new Exception("Kwota nie moze byc ujemna")
    }
  }

  def wyplata(amount: Double):Unit={
    if (_stanKonta-amount < 0 || amount == 0) {
      throw new Exception("Niepoprawna kwota wyplaty")
    } else {
      _stanKonta = _stanKonta-amount
    }
  } 
}