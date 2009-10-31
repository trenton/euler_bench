
val range = 1 to 1000
val result = range.foldLeft(0: BigInt)((sum, n) => sum + BigInt(n).pow(n))
println("sum: " + result)
val resultStr = result.toString
println("last 10 digits: " + resultStr.substring(resultStr.length - 10, resultStr.length))

