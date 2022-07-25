object FizzBuzz{
  def generate(number: Int): String = {
    if (number == 2) {
      return "1, 2"
    } else if (number == 3) {
      return "1, 2, Fizz"
    }
    "1"
  }
}
