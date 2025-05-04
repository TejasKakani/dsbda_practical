object NumberCheck {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val input = scala.io.StdIn.readDouble()

    if (input > 0)
      println("The number is positive.")
    else if (input < 0)
      println("The number is negative.")
    else
      println("The number is zero.")
  }
}

object PrintName {
  def main(args: Array[String]): Unit = {
    println("Your Name: John Doe")  // Replace 'John Doe' with your actual name
  }
}
