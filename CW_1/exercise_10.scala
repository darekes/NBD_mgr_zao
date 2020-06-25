package cw1

object CW10 {
  def main(args: Array[String]):Unit={
    val list: List[Int] = List(1, -2, 3, 14, -3, -10, 13)
    print(getAbsoluteValue(list))
  }

  def getAbsoluteValue(list: List[Int]):List[Int]={
    list.filter(x => -5 <= x && x <= 12).map(a => a.abs)
  }
}