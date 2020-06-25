package cw_1

object CW9 {
  def main(args: Array[String]):Unit ={
    val list: List[Int] = List(1, 2, 3, 4, 5, 6)
    print(increaseByOne(list))
  }

  def increaseByOne(list: List[Int]):List[Int]={
    list.map(a => a + 1)
  }
}