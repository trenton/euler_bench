import scala.io.Source._

val numbersOnly = """(\d+)""".r

def trimAndNew(s: String): BigInt = {
  val clean = numbersOnly.findFirstIn(s)
  BigInt(clean.get)
}

println(fromFile("numbers").getLines.foldLeft(0: BigInt)(_ + trimAndNew(_)))
