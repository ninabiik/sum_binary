object BinarySum extends App {
  def binarySum(bin1: String, bin2: String): String = {
    val num1 = BigInt(bin1.trim(), 2)
    val num2 = BigInt(bin2.trim(), 2)
    val sum = num1 + num2
    if (sum == 0) "0"
    else sum.toString(2)
  }

  // Testingin natin ang code >_<
  val input1 = "110011, 1010"
  val Array(bin1_1, bin1_2) = input1.split(", ")
  val result1 = binarySum(bin1_1, bin1_2)
  println(s"Test Input 1: $input1\nExpected output: $result1")

  // Testingin natin ang code ulit part 2 >_<
  val input2 = "11010, 00101001"
  val Array(bin2_1, bin2_2) = input2.split(", ")
  val result2 = binarySum(bin2_1, bin2_2)
  println(s"\nTest Input 2: $input2\nExpected output: $result2")
}
