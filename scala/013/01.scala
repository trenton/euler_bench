import scala.io.Source._

val numbersOnly = """(\d+)""".r

def trimAndNew(s: String): BigInt = {
  val clean = numbersOnly.findFirstIn(s)
  BigInt(clean.get)
}

val sum = fromFile("numbers").getLines.foldLeft(0: BigInt)(_ + trimAndNew(_))
println("sum: " + sum)
println("first 10: " + sum.toString.substring(0, 10))
