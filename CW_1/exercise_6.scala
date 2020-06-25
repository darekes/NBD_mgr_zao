package cw_1

object CW6 {
  def main(args: Array[String]):Unit={
    val tuple = Tuple3(2, "Tuple_tester", 0.3)
    getTuple(tuple)
  }

  def getTuple(myTuple: (Int, String, Double)):Unit={
    print(myTuple._1 + ", " + myTuple._2 + ", " + myTuple._3)
  }
}