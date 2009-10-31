
// split has "" as the first element, so we drop it
println(BigInt(2).pow(1000).toString.split("").drop(1).foldLeft(0L)(_ + Integer.parseInt(_)))
