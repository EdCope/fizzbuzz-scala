object FizzBuzz{
  def generate(number: Int): String = {
    (1 to number).map(replaceNumber(_)).mkString(", ")
  }
  def divisibleBy(divisor: Int, current: Int) = current % divisor == 0

  def replaceNumber(x: Int):String = {
    if(divisibleBy(15, x)) "FizzBuzz"
    else if(divisibleBy(3, x)) "Fizz"
    else if(divisibleBy(5, x)) "Buzz"
    else x.toString
  }
}
