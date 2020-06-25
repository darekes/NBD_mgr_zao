package cw_1

object CW7 {
  val products = Map("jajko" -> 15.0, "ser" -> 4.0, "gruszka" -> 2.0)

  def main(args: Array[String]):Unit={
    println(getPrice("jajko"))
    println(getPrice("ser"))
    println(getPrice("gruszka"))
  }

  def getPrice(product: String):Any={
    products.getOrElse(product, "No info")
  }
}