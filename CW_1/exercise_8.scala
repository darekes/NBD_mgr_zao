package cw_1

object CW8 {
  def main(args: Array[String]):Unit={
    val list:List[Int] = List(4, 1, 3, 1, 0, 2, 3, 0, 1, 1)
    print(remove(list, 0))
  }

  def remove(list: List[Int], n: Int): List[Int] = list match {
    case Nil => Nil
    case h :: t =>
    if (h == n)
      remove(t, n)
    else
      h :: remove(t, n)
  }
}