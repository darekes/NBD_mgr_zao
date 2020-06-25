package cw_1

object CW5 {
  def main(args: Array[String]):Unit={
    val products = Map("jajko" -> 15.0, "ser" -> 4.0, "gruszka" -> 2.0)
    println(makeDiscount(products))
  }

  def makeDiscount(products: Map[String, Double]):Map[String, Double] ={
    products.map({case(product, price) => product -> price * 0.9});
  }
}